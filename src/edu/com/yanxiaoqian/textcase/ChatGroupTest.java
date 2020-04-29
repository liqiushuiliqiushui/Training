package edu.com.yanxiaoqian.textcase;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.basetest.*;
import edu.com.yanxiaoqian.pages.ChatGroupPage;
import io.appium.java_client.MobileElement;

public class ChatGroupTest extends BaseTest{
	
	@Test
	public void test1() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.add("大家好");
	}
	
	@Test
	public void test2() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.addWhite();
	}
	
	@Test
	public void test3() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.add("aaa");
	}
	
	@Test
	public void test4() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.add("111");
	}
	
	@Test
	public void test5() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.add("");
	}
	
	@Test
	public void test6() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.add("毒品");
	}

}
