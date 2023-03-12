package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Logout {
    WebDriver driver;Properties prop;
    public void signOut(){
        driver.findElement(By.xpath(prop.getProperty("navigateToLogoutButton"))).click();
        driver.findElement(By.xpath(prop.getProperty("SignOutButton="))).click();

    }
}
