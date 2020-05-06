package com.cybertek.tests.day3_webelement_inro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlNotChanged {

    public static void main(String[] args) throws InterruptedException {

        /**
         * open chrome browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * click on Retrieve password
         * verify that url did not change
         */
        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //click on Retrieve password
        //WebElement -->Interface that represent elements on the webpage
        //findElement-->method used to find element on a webpage
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        //click()--> clicking web element
        retrievePasswordButton.click();

    }

}
