package com.cybertek.LocatorHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {

    public static void main(String[] args) throws InterruptedException {
        //go to amazon
        //Go to ebay
        //enter search term
        //click on search button
        //verify title contains search term

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com/");

        driver.get("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));

        searchBox.sendKeys("imac");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        String actualTitle = driver.getTitle();

        if(actualTitle.contains("imac")){

            System.out.println("PASS");
            System.out.println("actualTitle = " + actualTitle + " ----> Title contains our search item");

        } else {
            System.out.println("FAIL");
            System.out.println("actualTitle = " + actualTitle + " ---> Title doesn't contain our search item ");
        }

        driver.quit();
    }




    }

