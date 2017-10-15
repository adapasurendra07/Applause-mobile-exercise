package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	public AppiumDriver driver;
	
	public HomePage(AppiumDriver driver){
		this.driver=driver;
	}
		
	By signIn = By.name("log in Login");
	By menuclick = By.name("menu");
	
	public void clkSignIn(){
		driver.findElement(signIn).click();
	}
	
	public void clickMenu(){
		driver.findElement(menuclick).click();
	}
}
