package edu.com.gengyifan.pages;

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
	
	//����Ԫ��
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
	
	//��Ӧ������Ԫ��
	        //��ͼ�ⷢͼƬ�Ĳ�������������û��
	private AndroidElement choosePhoto() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement openPhotos() {
		return driver.findElementById("com.android.documentsui:id/artwork");
	}
	
	private AndroidElement recenPhoto() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView\r\n");
	}
	
	private AndroidElement getPhoto() {
//		return driver.findElementById("com.android.documentsui:id/icon_thumb");
		return driver.findElementById("com.android.gallery3d:id/gl_root_view");
	}
	
	        //����Ƭ��ͼƬ
	private AndroidElement takePhoto() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	
			//����
	private AndroidElement saveInOth() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement inferInOth() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	private AndroidElement syncInOth() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	
	
	//��ť�ĵ���¼�
	
	public void preSaveInOth() throws InterruptedException {
		saveInOth().click();
		Thread.sleep(1000);
	}
	
	public void preInferInOth() throws InterruptedException {
		inferInOth().click();
		Thread.sleep(1000);
	}
	
	public void preSyncInOth() throws InterruptedException {
		syncInOth().click();
		Thread.sleep(1000);
	}
	
	public void preOth() throws InterruptedException {
		othersMeus().click();
		Thread.sleep(1000);
	}
	
	public void preExit() throws InterruptedException {
		exitBtn().click();
		Thread.sleep(1000);
	}
	
	public void preSend() throws InterruptedException {
		sendBtn().click();
		Thread.sleep(1000);
	}
	
	public void editText(String text) throws InterruptedException {
		sendText().sendKeys(text);
		Thread.sleep(1000);
	}
	
	public void sendPhotoByChoose() throws InterruptedException {
		sendPhoto().click();
		Thread.sleep(1000);
		choosePhoto().click();
		Thread.sleep(1000);
		openPhotos().click();
		Thread.sleep(1000);
		getPhoto().click();
		Thread.sleep(1000);
	}
	
}
