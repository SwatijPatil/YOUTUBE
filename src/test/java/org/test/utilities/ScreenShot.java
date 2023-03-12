package org.test.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void ScreenshotMethod(WebDriver driver , String path) throws IOException {

     TakesScreenshot sc=((TakesScreenshot)driver);
     File ScrFile=sc.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(ScrFile, new File(path));




    }
    }