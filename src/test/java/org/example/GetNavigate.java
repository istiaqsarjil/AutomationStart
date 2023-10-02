package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GetNavigate extends DriverSetup{

    @Test
    public void testGetNavigate() throws InterruptedException {

        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        driver.navigate().to("https://istiaqsarjil.netlify.app/");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
        Thread.sleep(2000);

    }

    @Test
    public void testWindow() throws InterruptedException {

        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("(//a[normalize-space()='Open Tab'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Open Window'])[1]")).click();

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getWindowHandle());
        List<String> windowHandlelist = new ArrayList<>(driver.getWindowHandles());

        System.out.println(windowHandlelist.get(1));
        System.out.println(windowHandlelist.get(2));

        driver.switchTo().window(windowHandlelist.get(2));
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);

        driver.switchTo().window(windowHandlelist.get(1));
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);




    }
}
