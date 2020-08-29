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
	//点击讨论组，跳转至讨论组模块
	public void group() {
		pages.chatGroup().click();
	}
	
	@Test
	//新建三人讨论组
	public void addgroup() {
		pages.addGroup().click();
		pages.thirdPeople().click();
		pages.fivePeople().click();
		pages.text();
		pages.build().click();
		
	}
	
	@Test
	//新建二人讨论组
	public void addgroup1() {
		pages.addGroup().click();
		pages.thirdPeople().click();
		pages.text();
		pages.build().click();
		
	}
	
	@Test
	//讨论组内发送数字信息
	public void sendmessage() throws InterruptedException{
		pages.fiveGroup().click();
		pages.text();
		pages.send().click();	
		
	}

	@Test
	//收藏讨论组
	public void collectgroup() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.collectGroup().click();
		
	}
	
	@Test
	//取消收藏讨论组
	public void cancelcollectgroup() {
		pages.sevenGroup().click();
		pages.more().click();
		pages.cancelcollectGroup().click();
		
	}
	
	
	@Test
	//讨论组内查看成员列表
	public void watchmemberlist() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.memberlist().click();
		
	}
	
	@Test
	//讨论组重命名
	public void reName() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.rename().click();
		
	}
	
	@Test
	//讨论组内同步消息
	public void syncmessage() {
		pages.fiveGroup().click();
		pages.more().click();
		pages.sync().click();
		
	}
	
	@Test
	//讨论组内拍照上传图片
	public void sendpicture() throws InterruptedException{
		pages.fiveGroup().click();
		pages.sendPhotoByTake();
	}
	
	
	@Test
	//讨论组内文件上传图片
	public void sendpicture2() throws InterruptedException{
		pages.fiveGroup().click();
		pages.sendPhotoByChoose();
	}
	@Test
	//新建同名成员讨论组
	public void addgroupagain() {
		pages.addGroup().click();
		pages.thirdPeople().click();
		pages.fivePeople().click();
//		pages.type(text());
		pages.more().click();		
	}
	
	
	@Test
	//讨论组内点击本人头像
	public void sendfiles_zip() {
		pages.fiveGroup().click();
		pages.oneself().click();
	}
	
	@Test
	//讨论组内点击非本人头像
	public void sendfiles_word() {
		pages.sevenGroup().click();
		pages.another().click();
		
	}
	
	@Test
	//讨论组内下载pdf文件
	public void setMarkdown_state() {
		pages.sevenGroup().click();
		pages.download3().click();
	}
	
	@Test
	//讨论组内下载gif文件
	public void downloadfile() {
		pages.sevenGroup().click();
		pages.download1().click();
	}
	
	@Test
	//讨论组内下载zip文件
	public void copypaste_send() {
		pages.sevenGroup().click();
		pages.download2().click();
	}
	
	@Test
	//讨论组内下载docx文件
	public void openzip() {
		pages.sevenGroup().click();
		pages.download4().click();
	}
	
	@Test
	//讨论组内下载好的文件再次下载
	public void downloadagain() {
		pages.sevenGroup().click();
		pages.download4().click();
	}
	
	@Test
	//讨论组内发送空格信息
	public void sendnull() throws InterruptedException {
		pages.sevenGroup().click();
		pages.text();
		pages.send().click();
	}
	
	@Test
	//退出讨论组
	public void exitgroup() {
		pages.sevenGroup().click();
		pages.exit().click();
	}
		
}
