package com.cybertek.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test8 {

    WebDriver driver;

    @Test

    public void test7() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Autocomplete")).click();
        driver.findElement(By.cssSelector("#myCountry")).sendKeys("United States of America");

        // driver.findElement(By.xpath("//input[@value='Submit']")).click();
        String actualMessage = driver.findElement(By.cssSelector("#result")).getText();
        String expectedMessage = "You selected: United States of America";
        Assert.assertEquals(actualMessage,expectedMessage, "Verify selection message");
    }
}