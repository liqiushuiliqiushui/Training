package com.edu.myapplication;
mport android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class First {
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
        mDevice.findObject(By.text("应用")).click();
    }
    @Test
    public void test1() throws InterruptedException{
        mDevice.findObject(By.text("添加应用")).click();
        mDevice.findObject(By.res("192.168.43.83:id/name")).setText("1");
        //输入代号“dushu”
        mDevice.findObject(By.res("192.168.43.83:id/code")).setText("2");
        //点击保存
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test2() throws InterruptedException{//添加应用-代号格式错误
        mDevice.findObject(By.text("添加应用")).click();
        mDevice.findObject(By.res("192.168.43.83:id/name")).setText("3");
        mDevice.findObject(By.res("192.168.43.83:id/code")).setText("4");
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @After
    public void cleardown() throws InterruptedException {
        mDevice.findObject(By.text("退出")).click();
    }
}

}
