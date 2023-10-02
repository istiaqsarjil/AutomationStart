package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PerformScrollingUsingJS extends DriverSetup{

    @Test
    public void testJsExecute() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Running JavaScript command using Selenium.....

        //Casting the driver as JavascriptExecutor.....
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //execute Script......
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(3000);

        //To scroll to exact point by javascript executor, identified by Locators.........
        WebElement mouseHoverPoint = driver.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();",mouseHoverPoint);
        //arguments[0].scrollIntoView(); ..... means koyta argument and jei porjonto scroll korte chai seta user er view te niye asha.
        Thread.sleep(3000);
    }
}
