package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class autoStart extends DriverSetup{
    @Test

    public void loadGoogleHomePage() throws InterruptedException {
        //Open a browser
        //WebDriver driver = new ChromeDriver();

        //browse google home page https://www.google.com
        driver.get("https://www.google.com");

        //observe google home page

        Assert.assertEquals(driver.getTitle(),"Google");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        //Thread.sleep(5000);

        //close browser
        //driver.close();
    }

    @Test
    public void loadYouTubeHomePage() throws InterruptedException {
        //Open a browser
        //WebDriver driver = new ChromeDriver();

        //browse google home page https://www.google.com
        driver.get("https://www.youtube.com/");

        //observe google home page

        Assert.assertEquals(driver.getTitle(),"YouTube");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/");
        //Thread.sleep(5000);


        //close browser
        //driver.close();
    }

}
