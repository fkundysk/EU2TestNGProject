package com.cybertek.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.RandomAccess;

public class test3 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void test3() throws InterruptedException {

        driver.findElement(By.linkText("Registration Form")).click();

        WebElement firstNameBox = driver.findElement(By.cssSelector("[name=firstname]"));
        firstNameBox.sendKeys(RandomStringUtils.randomAlphabetic(1));
        Thread.sleep(1000);
        String actualResult = driver.findElement(By.xpath("//small[contains(text(),'first name must')]")).getText();
        String expectedResult = "first name must be more than 2 and less than 64 characters long";
        Assert.assertEquals(expectedResult,actualResult,"Verify message when single char input in the first name");

    }

}
