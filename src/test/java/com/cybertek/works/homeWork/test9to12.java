package com.cybertek.works.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test9to12 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        //Thread.sleep(1000);
        driver.quit();
    }

    @DataProvider(name = "TestData")

    public Object[] getData(){

        Object []  data = {"200","301","404","500"};
        return data;

    }


    @Test(dataProvider="TestData")
    public void test9to12(String pageNumber) throws InterruptedException {

            driver.findElement(By.linkText("Status Codes")).click();
            driver.findElement(By.linkText(pageNumber)).click();
            String actualMessage = driver.findElement(By.xpath("//p[contains(text(),'This page')]")).getText();
           // System.out.println("actualMessage = " + actualMessage);
            int indexOf = actualMessage.indexOf("For");
            actualMessage = actualMessage.substring(0,indexOf);
           // System.out.println("actualMessage = " + actualMessage);
            String expectedMessage = "This page returned a " + pageNumber + " status code.";
            Assert.assertTrue(actualMessage.contains(expectedMessage));

    }

}
