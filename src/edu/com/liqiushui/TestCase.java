package edu.com.liqiushui;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import edu.basetest.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase extends BaseTest{
	Pages pages=new Pages(driver);
	//点击聊天，页面是否跳转
	@Test
	public void clickchat() {
		pages.chat().click();
	}
	//点击我的，页面是否跳转
	@Test
	public void dump() {
		pages.my().click();
	}
	//点击联系人，页面是否跳转
	@Test
	public void clicklianxi() {
		pages.lianxi().click();
				
	}
	//收藏联系人
	@Test
	public void starr() {
		pages.xitong().click();
		pages.menu().click();
		pages.starr().click();
				
	}
	//取消收藏联系人
	@Test
	public void unstar() {
		pages.menu().click();
		pages.unstar().click();
				
	}
	
	//查看成员列表
			@Test

	public void seeNum() {
		pages.menu().click();
		pages.people().click();
	}
			
	//同步最近的消息		
	@Test

	public void news() {
		pages.menu().click();
		pages.news().click();	
	}
    //重命名点击
	@Test
	public void newname() {
		pages.menu().click();
		pages.rename().click();
				
	}
	//同步最近的消息
	public void newmess() {
	   pages.menu().click();
	   pages.news().click();		
	}
	

	@Test
	public void test10() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.renameWhite();
	}
	
	@Test
	public void test11() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.rename("aaa");
	}
	
	@Test
	public void test12() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.rename("111");
	}
	
	@Test
	public void test13() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.rename("毒品");
	}
	
	@Test
	public void test14() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.add("");
	}
	
	@Test
	public void test15() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.add("毒品");
	}
	
	@Test
	public void test16() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.deleteCollect();
	}
	
	@Test
	public void test17() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.viewList();
	}
	
	@Test
	public void test18() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.collectPerson();
	}
	
	@Test
	public void test19() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.deletePerson();
	}
}
