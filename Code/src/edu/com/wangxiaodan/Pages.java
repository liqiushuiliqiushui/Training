package edu.com.wangxiaodan;

import edu.basetest.BaseTest;
import edu.util.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Pages extends BaseTest{
//	public AndroidElement info() {
//		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
//	}
//	public AndroidElement cancel() {
//		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button");
//	}
//	public AndroidElement enter1() {
//		return driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\"ע������������µ�¼����ʹ�������˻����е�¼�� ������˺��������\"]/android.widget.Button[2]");
//	}
//	public AndroidElement nochose() {
//		return driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\"ע������������µ�¼����ʹ�������˻����е�¼�� ������˺��������\"]/android.widget.Button[1]");
//	}
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public Pages(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement my() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View");
	}
	public AndroidElement list() {
		return driver.findElementByXPath("//*[@text='��ʾ�˵�']");
	}
	public AndroidElement about() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	public AndroidElement close() {
		return driver.findElementByXPath("//*[@text='�ر�']");
	}
	public AndroidElement private1() {
		return driver.findElementByXPath("//*[@text='��˽����']");
	}
	public AndroidElement info() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
		
	}
	public AndroidElement cancel2() {
		return driver.findElementByXPath("//*[@text='ע��']");
	}
	public AndroidElement enter1() {
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}
	public AndroidElement nochose() {
		return driver.findElementByXPath("//*[@text='ȡ��']");
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
