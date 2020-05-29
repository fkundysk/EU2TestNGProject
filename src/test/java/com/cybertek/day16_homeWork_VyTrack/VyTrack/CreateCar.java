package com.cybertek.day16_homeWork_VyTrack.VyTrack;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateCar {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa1.vytrack.com/user/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
       //driver.quit();
    }

    @Test
    public void CreateCar() throws InterruptedException {

        driver.findElement(By.cssSelector("#prependedInput")).sendKeys("salesmanager122");
        driver.findElement(By.cssSelector("#prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]")).click();
        driver.findElement(By.xpath("//span[.='Vehicles']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Create Car']")).click();


    }

}
