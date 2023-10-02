package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocator extends DriverSetup{

    @Test
    public void testGoogleSearchById() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.id("APjFqb"));

        searchBox.sendKeys("Test Automation by id");

        Thread.sleep(2000);

        // Clear the text from the textarea
        searchBox.clear();

    }

    @Test
    public void testGoogleSearchByName() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Test Automation by name");
        Thread.sleep(2000);

        // Clear the text from the textarea
        searchBox.clear();

    }

    @Test
    public void testGoogleSearchByClassName() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.className("gLFyf"));

        searchBox.sendKeys("Test Automation by class name");
        Thread.sleep(2000);

        // Clear the text from the textarea
        searchBox.clear();
    }

    @Test
    public void testGoogleSearchByTextArea() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.tagName("textarea"));

        searchBox.sendKeys("Test Automation by tagname");
        Thread.sleep(2000);

        // Clear the text from the textarea
        searchBox.clear();
    }

    @Test
    public void testByLinkedText() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.linkText("Gmail"));
        System.out.println(searchBox.getText());
        searchBox.click();


        Thread.sleep(2000);
    }

    @Test
    public void testByPartialLinkText() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement imagelink = driver.findElement(By.partialLinkText("IMAGES"));
        imagelink.click();

        Thread.sleep(2000);
    }

    @Test
    public void testByCSSSelector() throws InterruptedException {
        driver.get("https://www.google.com/");

        // uU7dJb found by inspect element
        WebElement countryName = driver.findElement(By.cssSelector("div[class='uU7dJb']"));
        System.out.println(countryName.getText());

        Thread.sleep(2000);
    }

    @Test
    public void testByXpath() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement languageOption = driver.findElement(By.xpath("//div[@id='SIvCob']"));
        System.out.println(languageOption.getText());


        Thread.sleep(2000);
    }


    @Test
    public void testYoutubeSearch() throws InterruptedException {
        driver.get("https://www.youtube.com/");

        //search song
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("In the End - Linkin Park");
        Thread.sleep(2000);

        //click search button
        WebElement clickSearch = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        clickSearch.click();
        Thread.sleep(5000);

        //play song
        /*WebElement playSong = driver.findElement(By.xpath("//a[@id='video-title']"));
        playSong.click();
        Thread.sleep(50000);*/

        /*WebElement playSong1 = driver.findElement(By.xpath("path[@d='M22,3h-4l-5,5l3,3l6-6V3L22,3z M10.79,7.79C10.91,7.38,11,6.95,11,6.5C11,4.01,8.99,2,6.5,2S2,4.01,2,6.5S4.01,11,6.5,11 c0.45,0,.88-0.09,1.29-0.21L9,12l-1.21,1.21C7.38,13.09,6.95,13,6.5,13C4.01,13,2,15.01,2,17.5S4.01,22,6.5,22s4.5-2.01,4.5-4.5 c0-0.45-0.09-0.88-0.21-1.29L12,15l6,6h4v-2L10.79,7.79z M6.5,8C5.67,8,5,7.33,5,6.5S5.67,5,6.5,5S8,5.67,8,6.5S7.33,8,6.5,8z M6.5,19C5.67,19,5,18.33,5,17.5S5.67,16,6.5,16S8,16.67,8,17.5S7.33,19,6.5,19z']"));
        playSong1.click();
        Thread.sleep(50000);*/

        WebElement playSong = driver.findElement(By.xpath("//a[@href='/watch?v=eVTXPUF4Oz4&pp=ygUYaW4gdGhlIGVuZCAtIGxpbmtpbiBwYXJr']"));
        playSong.click();
        Thread.sleep(50000);



        //




        // Clear the text from the textarea
        searchBox.clear();

    }



}
