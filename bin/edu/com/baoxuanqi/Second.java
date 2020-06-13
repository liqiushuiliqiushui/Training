package com.edu.myapplication;
import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Second {
    Instrumentation mInstrumation;
    UiDevice mDevice;
    @Before
    public void startup() throws RemoteException,InterruptedException{
        mInstrumation= InstrumentationRegistry.getInstrumentation();
        mDevice=UiDevice.getInstance(mInstrumation);
        mDevice.pressHome();
        boolean status = mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("admin");
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("123456");
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test1() throws InterruptedException{
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=admin")).click();
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=create")).click();
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("a");
        mDevice.findObject(By.res("192.168.43.83:id/realname")).setText("b");
        mDevice.findObject(By.res("192.168.43.83:id/genderm")).click();
        mDevice.findObject(By.res("192.168.43.83:data-keys/renshi rs")).click();
        mDevice.findObject(By.res("192.168.43.83:id/password1")).setText("12345");
        mDevice.findObject(By.res("192.168.43.83:id/password2")).setText("12345");
        mDevice.findObject(By.res("192.168.43.83:name/email")).setText("1686977186@qq.com");
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test2() throws InterruptedException{
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=admin")).click();
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=create")).click();
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("aa");
        mDevice.findObject(By.res("192.168.43.83:id/realname")).setText("aaa");
        mDevice.findObject(By.res("192.168.43.83:id/genderm")).click();
        mDevice.findObject(By.res("192.168.43.83:data-keys/renshi rs")).click();
        mDevice.findObject(By.res("192.168.43.83:id/password1")).setText("54321");
        mDevice.findObject(By.res("192.168.43.83:id/password2")).setText("54321");
        mDevice.findObject(By.res("192.168.43.83:name/email")).setText("1686977186@163.com");
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @After
    public void cleardown() throws InterruptedException {
        mDevice.findObject(By.text("退出")).click();
    }



}

