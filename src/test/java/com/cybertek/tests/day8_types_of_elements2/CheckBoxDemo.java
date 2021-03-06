package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxDemo {


    @Test
    public void test1() {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));

        // how to verify checkbox is selected or not?

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //verify checkbox 1 is not selected 2 is selected.
        //driver.navigate().refresh();

        Assert.assertFalse(checkbox1.isSelected(), "verify to checkbox 1 is not selected");
        Assert.assertTrue(checkbox2.isSelected(), "verify to checkbox 2 is selected");

        //how to click checkbox?
        checkbox1.click();

        System.out.println("---------After Click-----------");

        //verify checkboxes again
        Assert.assertTrue(checkbox1.isSelected(), "verify to checkbox 1 is selected after click");
        Assert.assertTrue(checkbox2.isSelected(), "verify to checkbox 2 is selected");
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //driver.quit();
    }

}