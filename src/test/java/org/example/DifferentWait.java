package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentWait extends DriverSetup{

    @Test
    public void testWait() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='delayalert']")).click();
        //Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //driver.switchTo().alert().accept();
        alert.accept();


    }
}
