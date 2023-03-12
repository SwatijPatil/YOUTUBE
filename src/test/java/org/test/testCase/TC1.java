package org.test.testCase;

import org.test.base.Base;
import org.test.pages.HomePage;
import org.test.pages.Login;

import org.test.utilities.LogCapture;
import org.test.utilities.ScreenShot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;


public class TC1 extends Base {

  @Test
    public void testCase1() throws InterruptedException, IOException {
    Login lp=new Login(driver, prop);
    String ExpectResult="https://www.youtube.com/";

    Assert.assertEquals(driver.getCurrentUrl(),ExpectResult);


    Thread.sleep(3000);
    lp.signIn("rigitest1234@gmail.com", "Rigi@2022");
      String url= driver.getCurrentUrl();
      System.out.println(url);
//      Date time =GetdateTime.add();
//      //Date CurrentDatevalue="";
      String path="C://screenshot//testfail.png";
    LogCapture.LogFile("Tc1","Test login passed");
    ScreenShot.ScreenshotMethod(driver, path);
    System.out.println("Login pass");
    Thread.sleep(10000);
    ScreenShot.ScreenshotMethod(driver, path);
    HomePage Hp=new HomePage(driver, prop);
    Hp.clickOnhistory();
    ScreenShot.ScreenshotMethod(driver, path);
   LogCapture.LogFile("TC1","Click on History is working");
    ScreenShot.ScreenshotMethod(driver, path);
    Hp.clickOnLibrary();
    LogCapture.LogFile("TC1","Click on Library is working");
    Hp.clickOnMySubscription();
    LogCapture.LogFile("TC1","Click on Subscription is working");
      Hp.clickTrendingVideo();
      LogCapture.LogFile("TC1","Click on trending video");
  }


}
