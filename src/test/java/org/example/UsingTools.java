package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UsingTools extends DriverSetup{

    @Test
    public void testWeb() throws InterruptedException {

        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement textBox = driver.findElement(By.cssSelector("#autocomplete"));
        String tagName = textBox.getTagName();
        System.out.println(tagName);

        /*textBox.sendKeys("Hello");
        Thread.sleep(2000);

        textBox.clear();
        Thread.sleep(2000);*/

        System.out.println(textBox.getAttribute("placeholder"));

        System.out.println(textBox.isDisplayed());

        WebElement option = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        System.out.println(option.isSelected());
        option.click();

        System.out.println(option.isSelected());
        Thread.sleep(2000);

        System.out.println(option.getCssValue("padding"));

    }
}
