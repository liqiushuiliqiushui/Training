package edu.basetest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	URL url;
	public AndroidDriver<AndroidElement> driver;
	
//	LoginPage loginPage;
	
	@BeforeClass
//	@Test
	public void startUp() throws MalformedURLException, InterruptedException {
		url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("deviceName", "127.0.0.1:62001");
//	    cap.setCapability("deviceName", "WJX7N17428000523");
	    cap.setCapability("appPackage", "com.cnezsoft.xxm");
	    cap.setCapability("appActivity", "com.cnezsoft.xxm.MainActivity");
	    cap.setCapability("noReset", true);
	    
		driver = new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().window().getSize();
		//ï¿½ï¿½Â¼Ò³ï¿½ï¿½
//		Thread.sleep(1000);
//		loginPage = new LoginPage(driver);
//		loginPage.fillServer();
//		loginPage.fillName();
//		loginPage.fillPwd();
//		driver.findElementByXPath("//*[@text='µÇÂ¼']").click();
		
	}
	
	
	
	
	
	
//	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}





