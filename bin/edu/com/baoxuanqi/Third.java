package com.edu.myapplication;
import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Third {
    Instrumentation mInstrumation;
    UiDevice mDevice;
    @Before
    public void startup() throws RemoteException,InterruptedException {
        mInstrumation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumation);
        mDevice.pressHome();
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
    }
    @Test
    public void test1() throws InterruptedException{
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("admin");
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("123456");
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test2() throws InterruptedException{
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("aa");
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("123456");
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test3() throws InterruptedException{
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("admin");
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("123456789");
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @After
    public void cleardown() throws InterruptedException {
        mDevice.findObject(By.text("退出")).click();
    }
}

