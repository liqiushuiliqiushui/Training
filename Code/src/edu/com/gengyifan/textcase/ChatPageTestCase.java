//package edu.com.gengyifan.textcase;
//
//import java.util.List;
//
//import org.testng.annotations.Test;
//
//import android.os.strictmode.Violation;
//import edu.basetest.BaseTest;
//import edu.com.gengyifan.pages.ChatPage;
//import edu.com.gengyifan.pages.LoginPage;
//import edu.com.gengyifan.pages.MainActivityPage;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//
//public class ChatPageTestCase extends BaseTest{
//	
//	
//	
//	public void buildPage() {
//		mainActivityPage = new MainActivityPage(driver);
//		loginPage = new LoginPage(driver);
//		chatPage = new ChatPage(driver);
//	}
//	
//	@Test
//	public void testIntoChatPage() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//	}
//	
//	@Test
//	public void testIntoPageFromName() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preContact();
//		mainActivityPage.preCho();
//		mainActivityPage.preStart();
//	}
////	@Test canoot get list
//	public void newChat() {
//		buildPage();
//		List<MobileElement> list = mainActivityPage.preGetChatNum();
//		for(int j = 0;j<list.size();j++) {
//			System.out.println(list.get(j));
//			System.out.println(list.get(j).getText());
//		}
//	}
//	
//	@Test
//	public void newChatFromCon() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preContact();
//		mainActivityPage.preCho();
//		mainActivityPage.preStart();
////		chatPage.editText("newChatFromCon");
//		driver.pressKey(new KeyEvent(AndroidKey.BUTTON_7));
//		chatPage.preSend();
//		driver.navigate().back();
//		
//	}
//	
////	@Test
//	public void sendPhotoFromCache() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.sendPhotoByChoose();
//	}
//	
////	@Test
//	public void sendPhotoFromCma() throws InterruptedException{
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.sendPhotoByTake();
//	}
//	
//	@Test
//	public void saveChat() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.star();
//	}
//	
//	@Test
//	public void cancelSaveChat() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.star();
//	}
//	
//	@Test
//	public void checkInfor() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.information();
//		driver.navigate().back();
//	}
//	
//	
//	@Test
//	public void syncChat() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.syncChat();
//	}
//	
//	@Test
//	public void sendTest() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.send("Test1:For normal text.");
//	}
//	
//	@Test
//	public void sendTestNull() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.send("");
//	}
//	
//	@Test
//	public void sendTestSpace() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.send(" ");
//	}
//	
//	@Test
//	public void sendTestNum() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.send("1 2 3 4 5 6 7 8 9");
//	}
//	
//	@Test
//	public void sendTestSpecial() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.send("！@#￥%……&*（）|");
//	}
//	
//	@Test
//	public void sendTestChinese() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.send("可以！");
//	}
//	
//	@Test
//	public void takeOutSoGou() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.preEdit();
//	}
//	
//	@Test
//	public void pastTest() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.pasteTest();
//	}
//	
//	@Test
//	public void shareTest() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.shareData();
//	}
//	
//	@Test
//	//需要重新定位文本框的xPath，并且该文本框不能发送时间太长，否则没有撤回功能
//	public void backTest() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.backData();
//	}
//	
//	//以下两条测试用例针对未发送成功的对话框，执行前需要先制造一条并给予定位在ReSendData方法中
//	@Test
//	public void resendTest() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.resendData();
//	}
//	
//	@Test
//	public void deleteTest() throws InterruptedException {
//		buildPage();
//		mainActivityPage.preStartOne();
//		chatPage.deleteData();
//	}
//	
//}
