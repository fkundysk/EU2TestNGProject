package com.cybertek.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

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
    public void test1() throws InterruptedException {

        driver.findElement(By.xpath("//a[.='Registration Form']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("wrong_dob");

        Thread.sleep(4000);

        String expectedResult = "The date of birth is not valid";
        String actualResult = driver.findElement(By.xpath("//small[.='The date of birth is not valid']")).getText();

       Assert.assertEquals(expectedResult, actualResult,"Verify the 'The date of birth is not valid' message");

    }

}
