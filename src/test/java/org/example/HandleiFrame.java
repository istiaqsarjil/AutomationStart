package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleiFrame extends DriverSetup{

    @Test
    public void testiframe() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement mouseHoverPoint = driver.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();",mouseHoverPoint);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
        WebElement courses = driver.findElement(By.linkText("Courses"));
        System.out.println(courses.getText());
        Thread.sleep(3000);

        driver.switchTo().defaultContent();

    }
}
