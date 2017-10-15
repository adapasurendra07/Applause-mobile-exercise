package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass 
{
	
	@Test(priority=1)
	public void doLogin(){
		HomePage homepage = new HomePage(driver);
		homepage.clickMenu();
		Thread.sleep(2000);
		homepage.clkSignIn();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName("test");
		loginpage.enterPassword("test");
		loginpage.clkLogin();
		homepage.clickMenu();
		
		String actual = driver.findElement(By.name("person Account")).getText();
		String expected ="Account";
		
		Assert.assertEquals(actual.contains(expected), true);

	}
	
	@Test(dependsOnMethods="doLogin", priority=2)
	public void doLogOut() throws Exception{
				
		LoginPage logoutpage = new LoginPage(driver);
		logoutpage.clickMenu();
		Thread.sleep(3000);
		logoutpage.clkLogout();
		logoutpage.clickMenu();
		String actual = driver.findElement(By.name("log in Login")).getText();
		String expected = "Login";
		
		Assert.assertEquals(actual.contains(expected), true);

	}
}
