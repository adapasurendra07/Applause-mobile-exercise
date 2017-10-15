package testcases;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
	public static AndriodDriver driver;
	public static AndriodDriverWait wait;
	
	@BeforeTest
	public void openApp(){
		Sif (driver != null) {
	        return;
	    }
	    int executionOS;
		switch(executionOS){
	        case ANDROID:
	            File classpathRoot = new File(System.getProperty("user.dir"));
	            File appDir = new File(classpathRoot, "/app/Android");
	            File app = new File (appDir, "Contacts.apk");
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability("platformName", "Android");
	            capabilities.setCapability("deviceName", "JBGUCQKJDQMZCEEM");
	            capabilities.setCapability("app", app.getAbsolutePath());
	            capabilities.setCapability("appPackage","com.applause.automation.ionicconference");
	            capabilities.setCapability("appActivity","com.applause.automation.ionicconference");
	            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	            break;
	        case IOS:
	            classpathRoot = new File(System.getProperty("user.dir"));
	            appDir = new File(classpathRoot, "/app/iOS/");
	            app = new File(appDir, "ionic-conference.ipa");
	            capabilities = new DesiredCapabilities();
	            capabilities.setCapability("platformName", "ios");
	            capabilities.setCapability("deviceName", "=iPhone 5s");
	            capabilities.setCapability("app", app.getAbsolutePath());
	            capabilities.setCapability("appPackage","com.applause.automation.ionicconference");
	            capabilities.setCapability("appActivity","com.applause.automation.ionicconference");
	            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	            break;
	    }
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	
}
