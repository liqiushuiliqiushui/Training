package edu.com.wangxiaodan;

import edu.basetest.BaseTest;
import io.appium.java_client.android.AndroidElement;

public class Pages extends BaseTest{
	public AndroidElement my() {
		return driver.findElementByXPath("//*[@text='�ҵ�']");
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
	public AndroidElement cancel() {
		return driver.findElementByXPath("//*[@text='ע��']");
	}
	public AndroidElement enter1() {
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}
	public AndroidElement nochose() {
		return driver.findElementByXPath("//*[@text='ȡ��']");
	}
}
