package edu.com.gengyifan.pages;


import java.util.List;

import edu.util.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainActivityPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public MainActivityPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	//contact preson btn
	private AndroidElement contact() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	
	private AndroidElement chooseOne() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement startChat() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
	}
	// open from chatPage
	private AndroidElement startFromFirstPage() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement getChatList() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
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
	
	public void preStartOne() throws InterruptedException {
		startFromFirstPage().click();
		Thread.sleep(1000);
	}
	

	public List<MobileElement> preGetChatNum() {
		AndroidElement list = getChatList();
		return list.findElementsByXPath("	\r\n" + 
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
	}
	
}
