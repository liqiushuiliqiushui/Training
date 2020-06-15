package edu.com.gengyifan.pages;

import org.openqa.selenium.Keys;
import org.seleniumhq.jetty9.http.HttpStatus.Code;

import edu.util.BaseAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;




public class LoginPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	private AndroidElement serverEditView() {
//		return driver.findElementByXPath("//android.widget.EditText[@text=\"������\"]");	
//		return driver.findElementByXPath("//*[@class='android.widget.EditText[1]]");	
//		return driver.findElementByXPath("//android.widget.EditText[1]");
//		return driver.findElementById("71ec8dfa-b023-4e9b-9d01-eaf0b09d90d8");
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
//		return driver.findElementByAndroidUIAutomator("new UiSelector().text(\"������\")");
//		return new UiObject(new UiSelector)
		
	}
	private AndroidElement loginName() {
		return driver.findElementByXPath("//android.widget.EditText[2]");
	}
	private AndroidElement loginPwd() {
		return driver.findElementByXPath("//android.widget.EditText[3]");
		
	}
	
	public void fillServer() {
//		action.type(serverEditView(), "111");
//		action.claer(serverEditView());
		serverEditView().clear();
		serverEditView().click();
		driver.pressKey(new KeyEvent(AndroidKey.BUTTON_7));
		
	}
	public void fillName() {
//		action.type(loginName(), "222");
	}
	public void fillPwd() {
//		action.type(loginPwd(), "999");
		
	}
}
