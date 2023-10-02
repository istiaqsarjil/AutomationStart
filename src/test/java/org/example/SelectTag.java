package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class SelectTag extends DriverSetup{

    @Test
    public void testSelectTag() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option3");
        Thread.sleep(3000);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByValue("option1");
        Thread.sleep(3000);
        select.selectByIndex(0);
        Thread.sleep(3000);

        System.out.println(select.getFirstSelectedOption().getText());
    }


}
