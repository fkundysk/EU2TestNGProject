package com.cybertek.works.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test7 {

    WebDriver driver;

    @Test

    public void test7(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/upload']")).click();

        driver.findElement(By.cssSelector("#file-upload")).sendKeys("/Users/yavuzselim/Desktop/Selenium Test text.txt");
        driver.findElement(By.cssSelector("#file-submit")).click();

        String actualMessage = driver.findElement(By.tagName("h3")).getText();
        String expectedMessage = "File Uploaded!";

        Assert.assertEquals(actualMessage,expectedMessage, "Verify verify message");

        String actualUploadedFileName = driver.findElement(By.cssSelector("#uploaded-files")).getText();
        String expectedUploadedFileName = "Selenium Test text.txt";

        Assert.assertEquals(actualUploadedFileName,expectedUploadedFileName, "Verify uploaded file name");

        driver.quit();
    }


}
