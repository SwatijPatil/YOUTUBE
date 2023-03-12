package org.test.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void handleDropDownByIndex(WebElement element, int Index){
        Select s=new Select(element);
        s.selectByIndex(Index);
    }
    public static void handleDropDownByVisibleText(WebElement element, String text){
        Select s=new Select(element);
       s.selectByVisibleText(text);
    }
    public static void dropDownByValue(WebElement element, String value){
        Select s=new Select(element);
        s.deselectByValue(value);
    }
}
