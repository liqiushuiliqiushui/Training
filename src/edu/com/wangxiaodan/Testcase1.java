package edu.com.wangxiaodan;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

public class Testcase1 extends Pages{
	//点击我的，页面是否跳转
	@Test
	public void dump() {
		my().click();
	}
	//查看暄暄版本
	@Test
	public void xuaninfo() {
		my().click();
		list().click();
		about().click();
		close().click();
	}
	//查看暄暄隐私条款
	@Test
	public void xuanprivate() {
		my().click();
		list().click();
		about().click();
		private1().click();
	}
	//注销取消
	@Test
	public void zhuxiaocancel() {
		my().click();
		cancel().click();
		nochose().click();
	}
	//注销成功
	@Test
	public void zhuxiao() {
		my().click();
		cancel().click();
		enter1().click();
	}
}
