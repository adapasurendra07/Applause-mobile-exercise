package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public AppiumDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	By username = By.name("Username"));
	By password = By.name("Password"));
	By loginBtn = By.name("LOGIN"));
	
	
	By logout = By.name("log out Logout");
	
	
	public void enterUserName(String value){
		driver.findElement(username).sendKeys(value);
	}
	
	public void enterPassword(String value){
		driver.findElement(password).sendKeys(value);
	}
	
	public void clkLogin(){
		driver.findElement(loginBtn).click();
	}
	
		
	public void clkLogout(){
		driver.findElement(logout).click();
	}
}	
