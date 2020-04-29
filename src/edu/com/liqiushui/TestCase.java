package edu.com.liqiushui;

import org.testng.annotations.Test;

import edu.basetest.BaseTest;
import io.appium.java_client.android.AndroidElement;

public class TestCase extends Pages{

	//点击聊天，页面是否跳转
		@Test
		public void clickchat() {
			chat().click();
		}
	//点击创建聊天
		@Test
		public void createchat() {
			creat().click();
		}



}
