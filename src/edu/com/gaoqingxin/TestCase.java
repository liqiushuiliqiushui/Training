package edu.com.gaoqingxin;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import edu.basetest.BaseTest;
import edu.util.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase extends BaseTest{ 
	GroupPage pages=new GroupPage(driver);

	@Test
	//��������飬��ת��������ģ��
	public void group() {
		pages.chatGroup().click();
	}
	
	@Test
	//�½�����������
	public void addgroup() {
		pages.addGroup().click();
		pages.thirdPeople().click();
		pages.fivePeople().click();
		pages.text();
		pages.build().click();
		
	}
	
	@Test
	//�½�����������
	public void addgroup1() {
		pages.addGroup().click();
		pages.thirdPeople().click();
		pages.text();
		pages.build().click();
		
	}
	
	@Test
	//�������ڷ���������Ϣ
	public void sendmessage() throws InterruptedException{
		pages.fiveGroup().click();
		pages.text();
		pages.send().click();	
		
	}

	@Test
	//�ղ�������
	public void collectgroup() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.collectGroup().click();
		
	}
	
	@Test
	//ȡ���ղ�������
	public void cancelcollectgroup() {
		pages.sevenGroup().click();
		pages.more().click();
		pages.cancelcollectGroup().click();
		
	}
	
	
	@Test
	//�������ڲ鿴��Ա�б�
	public void watchmemberlist() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.memberlist().click();
		
	}
	
	@Test
	//������������
	public void reName() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.rename().click();
		
	}
	
	@Test
	//��������ͬ����Ϣ
	public void syncmessage() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.sync().click();
		
	}
	
	@Test
	//�������������ϴ�ͼƬ
	public void sendpicture() throws InterruptedException{
		pages.fiveGroup().click();
		pages.sendPhotoByTake();
	}
	
	
	@Test
	//���������ļ��ϴ�ͼƬ
	public void sendpicture2() throws InterruptedException{
		pages.fiveGroup().click();
		pages.sendPhotoByChoose();
	}
	@Test
	//�½�ͬ����Ա������
	public void addgroupagain() {
		pages.addGroup().click();
		pages.thirdPeople().click();
		pages.fivePeople().click();
//		pages.type(text());
		pages.more().click();		
	}
	
	
	@Test
	//�������ڵ������ͷ��
	public void sendfiles_zip() {
		pages.fiveGroup().click();
		pages.oneself().click();
	}
	
	@Test
	//�������ڵ���Ǳ���ͷ��
	public void sendfiles_word() {
		pages.sevenGroup().click();
		pages.another().click();
		
	}
	
	@Test
	//������������pdf�ļ�
	public void setMarkdown_state() {
		pages.sevenGroup().click();
		pages.download3().click();
	}
	
	@Test
	//������������gif�ļ�
	public void downloadfile() {
		pages.sevenGroup().click();
		pages.download1().click();
	}
	
	@Test
	//������������zip�ļ�
	public void copypaste_send() {
		pages.sevenGroup().click();
		pages.download2().click();
	}
	
	@Test
	//������������docx�ļ�
	public void openzip() {
		pages.sevenGroup().click();
		pages.download4().click();
	}
	
	@Test
	//�����������غõ��ļ��ٴ�����
	public void downloadagain() {
		pages.sevenGroup().click();
		pages.download4().click();
	}
	
	@Test
	//�������ڷ��Ϳո���Ϣ
	public void sendnull() throws InterruptedException {
		pages.sevenGroup().click();
		pages.text();
		pages.send().click();
	}
	
	@Test
	//�˳�������
	public void exitgroup() {
		pages.sevenGroup().click();
		pages.exit().click();
	}
		
}
