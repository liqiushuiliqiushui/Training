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
	
	@Test
	public void test7() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.freshen();
	}
	
	@Test
	public void test8() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.rename("讨论组一");
	}
	
	@Test
	public void test9() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.renameWhite();
	}
	
	@Test
	public void test10() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.rename("aaa");
	}
	
	@Test
	public void test11() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.rename("111");
	}
	
	@Test
	public void test12() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.rename("毒品");
	}
	
	@Test
	public void test13() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.collect();
	}
	
	@Test
	public void test14() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.deleteCollect();
	}
	
	@Test
	public void test15() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.viewList();
	}
	
	@Test
	public void test17() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.collectPerson();
	}
	
	@Test
	public void test18() throws InterruptedException{
		ChatGroupPage submit = new ChatGroupPage(driver);
		submit.deletePerson();
	}

}
