package org.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Login {

   WebDriver driver;
   Properties prop;
    public Login(WebDriver driver, Properties prop) {
        this.driver=driver;
        this.prop=prop;
    }
    public void signIn(String UserName, String Password) throws InterruptedException {
        System.out.println(driver);
        driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[4]")).click();
        driver.findElement(By.xpath(prop.getProperty("EmailId"))).sendKeys(UserName);
        driver.findElement(By.xpath(prop.getProperty("NextButton"))).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement password=driver.findElement(By.xpath(prop.getProperty("password")));
        Thread.sleep(6000);
        password.sendKeys(Password);
        driver.findElement(By.xpath(prop.getProperty("NextButton"))).click();
    }

}
