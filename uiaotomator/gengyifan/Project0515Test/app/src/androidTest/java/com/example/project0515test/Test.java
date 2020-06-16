package com.example.project0515test;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.view.KeyEvent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Before;

public class Test {
    Instrumentation instrumentation;
    UiDevice mDevice;

    @Before
    public void stratUp() throws RemoteException, InterruptedException, UiObjectNotFoundException {
        instrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(instrumentation);
        if(!mDevice.isScreenOn())
            mDevice.wakeUp();
        mDevice.pressHome();
        Thread.sleep(1000);
        mDevice.pressHome();
        Thread.sleep(1000);

//        //向右滑动
//        UiScrollable findApp = new UiScrollable(new UiSelector().text("日历"));
//        findApp.setAsHorizontalList();
//        findApp.scrollForward();
//        Thread.sleep(1000);

        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(2000);
    }

    @After
    public void closeApp(){
        mDevice.pressBack();
        mDevice.pressBack();
    }

    @org.junit.Test
    public void deviceTest() throws RemoteException {
        if (!mDevice.isScreenOn())
            mDevice.wakeUp();
        mDevice.pressHome();
        mDevice.pressBack();
    }

    //最基本的输入数字并发送
    @org.junit.Test
    public void send1() throws InterruptedException{
        UiObject2 chooseOne = mDevice.findObject(By.text("包\n"+"包宝宝\n"+"[在线]"));
        chooseOne.click();
        Thread.sleep(1000);
        mDevice.findObject(By.clazz("android.widget.EditText")).click();
        Thread.sleep(1000);

        mDevice.findObject(By.text("发送")).click();
    }

    //输入空格发送
    @org.junit.Test
    public void sendSpace() throws InterruptedException {
        UiObject2 chooseOne = mDevice.findObject(By.text("包\n"+"包宝宝\n"+"[在线]"));
        chooseOne.click();
        Thread.sleep(1000);
        mDevice.findObject(By.clazz("android.widget.EditText")).click();
        Thread.sleep(1000);
        mDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_SPACE);
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送")).click();
    }

    //输入其他符号发送
    @org.junit.Test
    public void sendPoint() throws InterruptedException {
        UiObject2 chooseOne = mDevice.findObject(By.text("包\n" +
                "包宝宝\n" +
                "[离线]"));
        chooseOne.click();
        Thread.sleep(1000);
        mDevice.findObject(By.clazz("android.widget.EditText")).click();
        Thread.sleep(1000);
        mDevice.pressKeyCode(KeyEvent.KEYCODE_MINUS);
        mDevice.pressKeyCode(KeyEvent.KEYCODE_PLUS);
        mDevice.pressKeyCode(KeyEvent.KEYCODE_STAR);
        mDevice.pressKeyCode(KeyEvent.KEYCODE_SLASH);
        mDevice.pressKeyCode(KeyEvent.KEYCODE_EQUALS);
        mDevice.pressKeyCode(KeyEvent.KEYCODE_COMMA);
        mDevice.pressKeyCode(KeyEvent.KEYCODE_PERIOD);
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送")).click();
    }
}
