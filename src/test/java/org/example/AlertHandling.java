package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandling extends DriverSetup{

    @Test
    public void testAlert() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS Alert");
        alert.accept();
        Thread.sleep(2000);
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You clicked: Cancel");

    }

    @Test
    public void testAlert2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("Hello world");
        Thread.sleep(2000);

    }


}
