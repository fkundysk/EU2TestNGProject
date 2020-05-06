package com.cybertek.tests.day12_actions_jsexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void clickWithJS(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
        // clicking with JavaScriptExecutor
        // create js executor object

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // use executeScript
        // use executeScript
        jse.executeScript("arguments[0].click();",dropdownLink);
    }

    @Test
    public void type(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input"));

        inputbox.sendKeys("Some Text");



    }
}



