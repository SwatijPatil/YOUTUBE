package org.test.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties prop;
    @BeforeMethod
    public void browserOpen() throws IOException, IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        FileInputStream fis=new FileInputStream("C:\\Users\\swati\\IdeaProjects\\YTFrameWorkUsingPOM\\Object.properties");
        prop=new Properties();
        prop.load(fis);
        driver.get(prop.getProperty("URL"));
       System.out.println(driver);
    }
//    @AfterMethod
//    public void closeTheBrowser(){
//        driver.close();
//    }
}
