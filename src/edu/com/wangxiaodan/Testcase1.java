package edu.com.wangxiaodan;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import edu.basetest.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Testcase1 extends BaseTest{
	Pages pages=new Pages(driver);
	//����ҵģ�ҳ���Ƿ���ת
	@Test
	public void dump() {
		pages.my().click();
	}
	//�鿴���Ѱ汾
	@Test
	public void xuaninfo() {
		pages.my().click();
		pages.list().click();
		pages.about().click();
		pages.close().click();
	}
	//�鿴������˽����
	@Test
	public void xuanprivate() {
		pages.my().click();
		pages.list().click();
		pages.about().click();
		pages.private1().click();
	}
	//ע��ȡ��
	@Test
	public void zhuxiaocancel() {
		pages.my().click();
		pages.cancel2().click();
		pages.nochose().click();
	}
	//ע���ɹ�
	@Test
	public void zhuxiao() {
		pages.my().click();
		pages.cancel2().click();
		pages.enter1().click();
	}
	@Test
	public void test1() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.add("��Һ�");
	}
	
	@Test
	public void test2() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.addWhite();
	}
	
	@Test
	public void test3() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.add("aaa");
	}
	
	@Test
	public void test4() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.add("111");
	}
	
	@Test
	public void test5() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.add("");
	}
	
	@Test
	public void test6() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.add("��Ʒ");
	}
	
	@Test
	public void test7() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.freshen();
	}
	
	@Test
	public void test8() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.rename("������һ");
	}
	
	@Test
	public void test9() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.renameWhite();
	}
	
	@Test
	public void test10() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.rename("aaa");
	}
	
	@Test
	public void test11() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.rename("111");
	}
	
	@Test
	public void test12() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.rename("��Ʒ");
	}
	
	@Test
	public void test13() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.collect();
	}
	
	@Test
	public void test14() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.deleteCollect();
	}
	
	@Test
	public void test15() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.viewList();
	}
	
	@Test
	public void test17() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.collectPerson();
	}
	
	@Test
	public void test18() throws InterruptedException{
		Pages submit = new Pages(driver);
		submit.deletePerson();
	}

}
