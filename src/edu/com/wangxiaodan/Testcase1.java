package edu.com.wangxiaodan;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

public class Testcase1 extends Pages{
	//����ҵģ�ҳ���Ƿ���ת
	@Test
	public void dump() {
		my().click();
	}
	//�鿴���Ѱ汾
	@Test
	public void xuaninfo() {
		my().click();
		list().click();
		about().click();
		close().click();
	}
	//�鿴������˽����
	@Test
	public void xuanprivate() {
		my().click();
		list().click();
		about().click();
		private1().click();
	}
	//ע��ȡ��
	@Test
	public void zhuxiaocancel() {
		my().click();
		cancel().click();
		nochose().click();
	}
	//ע���ɹ�
	@Test
	public void zhuxiao() {
		my().click();
		cancel().click();
		enter1().click();
	}
}
