package edu.com.gengyifan.pages;


import edu.util.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainActivityPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public MainActivityPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	private AndroidElement contact() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	
	private AndroidElement chooseOne() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement startChat() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
	}
	
	public void preContact() throws InterruptedException {
		contact().click();
		Thread.sleep(1000);
	}
	
	public void preCho() throws InterruptedException {
		chooseOne().click();
		Thread.sleep(1000);
	}
	
	public void preStart() throws InterruptedException {
		startChat().click();
		Thread.sleep(1000);
	}
	
}
