package edu.com.liqiushui;

import edu.basetest.BaseTest;
import io.appium.java_client.android.AndroidElement;

public class Pages extends BaseTest{
	public AndroidElement chat() {
		return driver.findElementByXPath("//*[@text='聊天']");
	}
	public AndroidElement creat() {
		return driver.findElementByXPath("//*[@text='创建聊天']");
	}
	public AndroidElement my() {
		return driver.findElementByXPath("//*[@text='我的']");
	}
	public AndroidElement list() {
		return driver.findElementByXPath("//*[@text='显示菜单']");
	}
	public AndroidElement about() {
		return driver.findElementByXPath("//*[@text='关于']");
	}
	public AndroidElement close() {
		return driver.findElementByXPath("//*[@text='关闭']");
	}
	public AndroidElement private1() {
		return driver.findElementByXPath("//*[@text='隐私条款']");
	}
	public AndroidElement info() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
		
	}
	public AndroidElement cancel() {
		return driver.findElementByXPath("//*[@text='注销']");
	}
	public AndroidElement enter1() {
		return driver.findElementByXPath("//*[@text='确认']");
	}
	public AndroidElement nochose() {
		return driver.findElementByXPath("//*[@text='取消']");
	}
}
