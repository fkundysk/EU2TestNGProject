package com.cybertek.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test5 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test5() throws InterruptedException {

        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("Mike");
        driver.findElement(By.cssSelector("[name=lastname")).sendKeys("Smith");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mikesmith");
        driver.findElement(By.cssSelector("[name=email]")).sendKeys("mikesmith@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(RandomStringUtils.random(8));
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("555-456-3456");
        driver.findElement(By.xpath("//input[@value='male']")).click();
        driver.findElement(By.cssSelector("[name=birthday]")).sendKeys("12/10/2000");
        Select select = new Select(driver.findElement(By.cssSelector("[name=department]")));
        select.selectByValue("DE");
        Select select2 = new Select(driver.findElement(By.cssSelector("[name=job_title]")));
        select2.selectByVisibleText("SDET");
        driver.findElement(By.cssSelector("#inlineCheckbox2")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.xpath("//p[contains(text(),'successfully')]")).getText();
        String expectedResult = "You've successfully completed registration!";
        Assert.assertEquals(actualResult,expectedResult,"Verify confirmation message");

    }

}
