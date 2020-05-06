package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemoTest {


    @Test

    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement userNameInput = driver.findElement(By.id("username"));

        System.out.println("userNameInput.isDisplayed() = " + userNameInput.isDisplayed());


        //TASK
        //verify that username not displayed in the screen

        Assert.assertFalse(userNameInput.isDisplayed(),"Verify inputbox not displayed");

        // click start button
        WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
        startButton.click();
        // diger bir yontem start buttonuna basmak icin
        //driver.findElement(By.cssSelector("#start>button")).click();

        Thread.sleep(5000);

        // verify username displayed on the screen

        Assert.assertTrue(userNameInput.isDisplayed(),"Verify inputbox is dispalyed");
        System.out.println("userNameInput.isDisplayed() = " + userNameInput.isDisplayed());

        driver.quit();


    }
}
