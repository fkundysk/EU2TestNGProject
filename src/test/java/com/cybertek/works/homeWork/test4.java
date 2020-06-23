package com.cybertek.works.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test4 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");

      }

      @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

      }

      @Test
    public void test4() throws InterruptedException {

        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("lastname")).sendKeys(RandomStringUtils.randomAlphabetic(1));
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.xpath("//small[contains(text(),'The last name must')]")).getText();
        String expectedresult = "The last name must be more than 2 and less than 64 characters long";
        Assert.assertEquals(actualResult,expectedresult,"Verify message when single char input in the last name");

      }

}
