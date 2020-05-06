package com.cybertek.LocatorHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {

    public static void main(String[] args) throws InterruptedException {

        //Go to ebay
        //enter search term
        //click on search button
        //print number of results

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));

        searchBox.sendKeys("imac");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        WebElement resultNumber = driver.findElement(By.xpath("//h1/span[@class = 'BOLD' ][1]"));

        System.out.println("Result for Imac search on ebay = " + resultNumber.getText());

        driver.quit();

    }
}
