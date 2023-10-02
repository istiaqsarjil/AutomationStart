package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PathCustom extends DriverSetup{


    @Test
    public void testbdjobs() throws InterruptedException {

        driver.get("https://www.bdjobs.com/");

        //Going Custom.........................

        driver.findElement(By.cssSelector("form > div > input")).sendKeys("sqa jobs");
        Thread.sleep(2000);

        /*driver.findElement(By.xpath("//form/div/input")).clear();
        Thread.sleep(2000);*/

        //double attribute.....................
        //xpath double attribute
        /*driver.findElement(By.xpath("//select[@id=\"qOT\" and @class=\"form-control active\"]")).click();
        Thread.sleep(2000);*/

        driver.findElement(By.cssSelector("option[value=\"4\"]")).click();
        Thread.sleep(1000);

        //cssSelector Double attribute
        driver.findElement(By.cssSelector("input[class=\"btn btn-default\"][value=\"Search\"]")).click();
        Thread.sleep(2000);

        System.out.println(driver.getCurrentUrl());

        //for printing the TAB and WINDOW indentification numbers
        //System.out.println(driver.getWindowHandles());

        List<String> tabcount1 = new ArrayList<>(driver.getWindowHandles());

        System.out.println(tabcount1.get(0));
        System.out.println(tabcount1.get(1));

        //switching Tab..........................................
        driver.switchTo().window(tabcount1.get(1));
        System.out.println(driver.getCurrentUrl());

        //using contains.........................................
        /*driver.findElement(By.xpath("//*[contains(@aria-label,'Functional')]")).click();
        System.out.println("category clicked");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//label[normalize-space()='IT/Telecommunication'])[1]")).click();


        driver.findElement(By.cssSelector("#spfcat8")).click();
        Thread.sleep(2000);*/

        //using contains
        System.out.println("Total Jobs for SQA: " +driver.findElement(By.xpath("//*[contains(@id,'TotalRecord')]")).getText());

        System.out.println("Total Vacancies for SQA: " +driver.findElement(By.cssSelector("*[id*='TotalVacancy']")).getText());


    }

    @Test
    public void testnopcommerce() throws InterruptedException {

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Nokia Lumia 1020");
        Thread.sleep(2000);

        //contains... xpath.......
        driver.findElement(By.xpath("//*[contains(@type, 'subm')]")).click();
        Thread.sleep(2000);

        //multiple attributes.....
        //cssSelector
        driver.findElement(By.cssSelector("a[href='/nokia-lumia-1020'] [title='Show details for Nokia Lumia 1020']")).getText();

        //xpath
        driver.findElement(By.xpath("//a[@href='/nokia-lumia-1020' and @title='Show details for Nokia Lumia 1020']")).click();
        Thread.sleep(2000);

        //contains + multiple attributes... cssSelector.......
        driver.findElement(By.cssSelector("*[type*=\"button\"][id*=\"add-to-cart\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//p/a[@href=\"/cart\"]")).click();
        Thread.sleep(2000);

        //parent-child.... xpath....
        System.out.println(driver.findElement(By.xpath("//tr/td[3]")).getText());

        //parent-child.... cssSelector... advance....
        System.out.println("Number of Product: "+driver.findElement(By.cssSelector("form>div>table>tbody>tr>td:nth-child(5)>input")).getAttribute("value"));

        //starts-with........
        System.out.println(driver.findElement(By.xpath("//td/a/img[starts-with(@alt, \"Picture of Nokia\")]")).getAttribute("alt"));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//tr/td[5]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tr/td[5]/input")).sendKeys("2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/button[@id='updatecart']")).click();
        Thread.sleep(2000);

        //sibling work..... + Assertion........
        String unitPrice = driver.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]")).getText();
        String totalPrice = driver.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]")).getText();

        Assert.assertEquals(unitPrice,"$349.00","Assertion Failed");
        Assert.assertEquals(totalPrice,"$698.00","Assertion Failed");

        System.out.println("CUSTOM xpath & cssSelector DONE!!");


    }
}
