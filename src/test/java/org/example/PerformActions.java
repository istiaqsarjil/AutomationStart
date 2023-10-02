package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PerformActions extends DriverSetup{

    @Test
    public void testActions() throws InterruptedException {

        driver.get("https://demoqa.com/menu#");
        WebElement mainItem = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
        Actions action = new Actions(driver);
        action.clickAndHold(mainItem).build().perform();
        Thread.sleep(3000);

        /*driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']")).click();
        Thread.sleep(3000);*/
        action.clickAndHold(driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"))).build().perform();
        driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']")).click();
        Thread.sleep(3000);
    }


    @Test
    public void testCopyPaste() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions action3 = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello Sarjil");

        action3.keyDown(Keys.CONTROL);
        action3.sendKeys("a");
        action3.keyUp(Keys.CONTROL);
        action3.build().perform();
        Thread.sleep(3000);

        action3.keyDown(Keys.CONTROL);
        action3.sendKeys("c");
        action3.keyUp(Keys.CONTROL);
        action3.build().perform();
        Thread.sleep(3000);

        WebElement paste = driver.findElement(By.xpath("//input[@id='name']"));
        paste.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(3000);


    }

    @Test
    public void scrollTest() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions action4 = new Actions(driver);
        action4.scrollByAmount(0,500).build().perform();
        Thread.sleep(3000);

        action4.scrollToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(3000);

    }

    @Test
    public void selectFromList() throws InterruptedException {

        driver.get("https://demo.automationtesting.in/Selectable.html");
        Actions action1 = new Actions(driver);
        action1.click(driver.findElement(By.xpath("//a[normalize-space()='Serialize']"))).build().perform();
        Thread.sleep(3000);

        action1.click(driver.findElement(By.xpath("//div[@id='Serialize']//li[5]"))).build().perform();
        Thread.sleep(3000);

        action1.click(driver.findElement(By.xpath("//a[normalize-space()='Default Functionality']"))).build().perform();
        Thread.sleep(2000);

        WebElement ulElement = driver.findElement(By.xpath("//div[@id='Default']//li[3]"));
        ulElement.click();
        Thread.sleep(3000);


    }
}
