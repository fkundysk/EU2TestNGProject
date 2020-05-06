package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");

        Thread.sleep(5000);
        driver.quit();

        driver = WebDriverFactory.getDriver("firefox");
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);
        driver.quit();



    }
}
