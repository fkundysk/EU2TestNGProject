package com.cybertek.works.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {

        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//label[@for='inlineCheckbox1']")).getText(), "C++" ,"verify the C++");
        Assert.assertEquals(driver.findElement(By.xpath("//label[@for='inlineCheckbox2']")).getText(), "Java" ,"verify the Java");
        Assert.assertEquals(driver.findElement(By.xpath("//label[@for='inlineCheckbox3']")).getText(), "JavaScript" ,"verify the JavaScript");




    }






}
