package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    Properties prop;
    public HomePage(WebDriver driver, Properties prop){
        this.driver=driver;
        this.prop=prop;
    }
    public void clickTrendingVideo() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath(prop.getProperty("menu"))).click();
        driver.findElement(By.xpath(prop.getProperty("Trending"))).click();
    }
   public void clickOnhistory(){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElement(By.id("guide-icon")).click();
       driver.findElement(By.xpath(prop.getProperty("History"))).click();
    }
   public void clickOnMySubscription(){
        driver.navigate().back();
       driver.findElement(By.xpath(prop.getProperty("Subscription"))).click();

   }
   public void clickOnLibrary(){
       driver.navigate().back();
       driver.findElement(By.xpath(prop.getProperty("menu"))).click();
       driver.findElement(By.xpath(prop.getProperty("Library"))).click();

}

}
