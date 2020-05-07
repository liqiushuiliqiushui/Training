package edu.com.gengyifan.pages;

import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

import android.content.pm.ActivityInfo;
import android.content.res.Resources.Theme;
import edu.util.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChatPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public ChatPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	//需要修改的元素
	
	private AndroidElement textData() {//对话框的定位不确定，重新运行需要修改
//		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]");
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[1]");
	}
	private AndroidElement textDataBack() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]");
	}
	
	private AndroidElement textDataResend() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View[1]");
	}
	//基本元素
	private AndroidElement othersMeus() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	private AndroidElement exitBtn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]");
	}
	
	private AndroidElement sendPhoto() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
	}
	
	private AndroidElement sendText() {
		return driver.findElementByXPath("	\r\n" + 
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	
	private AndroidElement sendBtn() {
		return driver.findElementByXPath("	\r\n" + 
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
	}
	
	//响应产生的元素
    	//从图库发图片四步（第三步可能没有
	private AndroidElement choosePhoto() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement openPhotos() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]");
		
	}
	
	private AndroidElement photos() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView\r\n");
	}
	
	private AndroidElement getPhoto() {
		return driver.findElementById("com.android.gallery3d:id/gl_root_view");
		
	}
	private AndroidElement getPhoto2() {
		return driver.findElementById("com.android.gallery3d:id/gl_root_view");
	}
	        //从拍照发图片
	private AndroidElement takePhoto() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	
			//其他
	private AndroidElement saveInOth() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement inferInOth() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	private AndroidElement syncInOth() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	
	
	private AndroidElement pasteTestBtn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement pasteToBtn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	}
	
	private AndroidElement shareDataBtn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	private AndroidElement reSendDataBtn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	private AndroidElement deleteDataBtn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]");
	}
	
	private AndroidElement backDataBtn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	//按钮的点击事件
	
	
	public void preSaveInOth() throws InterruptedException {
		action.click(saveInOth());
		Thread.sleep(1000);
	}
	
	public void preInferInOth() throws InterruptedException {
		action.click(inferInOth());
		Thread.sleep(1000);
	}
	
	public void preSyncInOth() throws InterruptedException {
		action.click(syncInOth());
		Thread.sleep(1000);
	}
	
	public void preOth() throws InterruptedException {
		action.click(othersMeus());
		Thread.sleep(1000);
	}
	
	public void preExit() throws InterruptedException {
		action.click(exitBtn());
		Thread.sleep(1000);
	}
	
	
	public void preEdit() throws InterruptedException {
		sendText().click();
		Thread.sleep(3000);
		
	}
	
	
	
	public void preSend() throws InterruptedException {
		action.click(sendBtn());
		Thread.sleep(1000);
	}
	
	public void editText(String text) throws InterruptedException {
		sendText().sendKeys(text);
		Thread.sleep(1000);
	}
	
	public void sendPhotoByChoose() throws InterruptedException {
		action.click(sendPhoto());
		Thread.sleep(1000);
		action.click(choosePhoto());
		Thread.sleep(1000);
		action.click(openPhotos());
		Thread.sleep(1000);
	}
	
	
	public void sendPhotoByTake() throws InterruptedException {
		action.click(sendPhoto());
		Thread.sleep(1000);
		action.click(takePhoto());
		Thread.sleep(1000);
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
		Thread.sleep(10000);
		action.click(driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"确定\"]"));
		Thread.sleep(1000);
	}
	
	public void star() throws InterruptedException {
		preOth();
		preSaveInOth();
		driver.navigate().back();
		
	}
	
	public void information() throws InterruptedException {
		preOth();
		preInferInOth();
	}
	
	public void syncChat() throws InterruptedException {
		preOth();
		preSyncInOth();
		
	}
	
	public void send(String test) throws InterruptedException {
		editText(test);
		preSend();
	}
	
	public void pasteTest() throws InterruptedException {
		action.longPress(textData());
		Thread.sleep(1000);
		action.click(pasteTestBtn());
		Thread.sleep(2000);
		action.longPress(sendText());
		Thread.sleep(2000);
		action.click(pasteToBtn());
		Thread.sleep(1000);
		preSend();
	}
	
	public void shareData() throws InterruptedException {
		action.longPress(textData());
		Thread.sleep(1000);
		action.click(shareDataBtn());
		Thread.sleep(2000);
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.ImageView"));
		Thread.sleep(1000);
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
	
	}
	
	public void backData() throws InterruptedException {
		action.longPress(textDataBack());
		Thread.sleep(1000);
		action.click(backDataBtn());
		Thread.sleep(1000);
		
	}
	
	public void resendData() throws InterruptedException {
		action.longPress(textDataResend());
		Thread.sleep(1000);
		action.click(reSendDataBtn());
		Thread.sleep(1000);
		
	}
	
	public void deleteData() throws InterruptedException {
		action.longPress(textDataResend());
		Thread.sleep(2000);
		action.click(deleteDataBtn());
		Thread.sleep(2000);
	}
}
