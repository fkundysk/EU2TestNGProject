package com.cybertek.tests.day15_staletest;

import com.cybertek.tests.TestBase;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StaleTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://www.google.com");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Selenium"+ Keys.ENTER);

        WebElement results = driver.findElement(By.id("result-stats"));
        Assert.assertTrue(results.isDisplayed());

        // go to google again
        driver.navigate().back();
        // sometimes page loaded again because of back,refresh or click some button
        // sometimes location lost so we refinding the webelement
        // it'' called staled element
        input = driver.findElement(By.name("q"));
        input.sendKeys("Java"+Keys.ENTER);
        results = driver.findElement(By.id("result-stats"));

        Assert.assertTrue(results.isDisplayed());

    }


}
