package edu.com.yanxiaoqian.pages;

import edu.util.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChatGroupPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public ChatGroupPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	private AndroidElement chatGroup() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	
	private AndroidElement chat1() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement text() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	
	private AndroidElement submit() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
	}
	
	private AndroidElement right() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	private AndroidElement right1() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement right2() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	private AndroidElement right3() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	private AndroidElement right4() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]");
	}
	
	private AndroidElement cancel() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText/android.widget.Button[1]");
	}
	
	private AndroidElement redefine() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText/android.widget.Button[2]");
	}
	
	
	private AndroidElement retext() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	
	private AndroidElement person() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement star() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.Button[2]");
	}
	
	public void add(String s) throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		action.type(text(),s);
		action.click(submit());
	}
	
	public void addWhite() throws InterruptedException{
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		action.click(submit());
	}
	
	public void freshen() throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right4());
	}
	
	public void rename(String s) throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right3());
		Thread.sleep(3000);
		action.type(retext(),s);
		action.click(redefine());
	}
	
	public void renameWhite() throws InterruptedException{
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right3());
		Thread.sleep(3000);
		action.click(redefine());
	}
	
	public void collect() throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right1());
	}
	
	public void deleteCollect() throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right1());
	}
	
	public void viewList() throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right3());
	}
	
	public void collectPerson() throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right3());
		Thread.sleep(3000);
		action.click(person());
		action.click(star());
	}
	
	public void deletePerson() throws InterruptedException {
		Thread.sleep(3000);
		action.click(chatGroup());
		Thread.sleep(3000);
		action.click(chat1());
		Thread.sleep(3000);
		action.click(right());
		Thread.sleep(3000);
		action.click(right3());
		Thread.sleep(3000);
		action.click(person());
		action.click(star());
	}

}
