package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void RadioButtonTest1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));


        // how to check is radio button selected
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());


        // verify blue is selected red is not selected
        Assert.assertTrue(blueRadioButton.isSelected(),"Verify Blue button is checked");
        Assert.assertFalse(redRadioButton.isSelected(), "Verify Red button is NOT checked");

        //how to select radio button?
        //we use click method to select radio button
        redRadioButton.click();

        // verify blue is not selected red is selected
        Assert.assertFalse(blueRadioButton.isSelected(),"Verify Blue button is NOT checked");
        Assert.assertTrue(redRadioButton.isSelected(), "Verify Red button is checked");

        driver.quit();

    }

}
