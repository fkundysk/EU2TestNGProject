package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod

    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void switchWindowsTest() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/windows");

        // get title

        System.out.println("Title before new window " + driver.getTitle());

        // click click here button
        driver.findElement(By.linkText("Click Here")).click();

        // get title again
        System.out.println("Title after new window = " + driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println(currentWindowHandle);

        // we will switch to new window
        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("windowHandles.size() = " + windowHandles.size());

        for (String windowHandle : windowHandles) {
            if (!currentWindowHandle.equals(windowHandle)){
                driver.switchTo().window(windowHandle);

            }
        }
        System.out.println("Title after switching window: " + driver.getTitle());

    }
    @Test
    public void moreThan2Window (){

        driver.get("http://practice.cybertekschool.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Before switch " + driver.getTitle());

        // loop through each window
        for (String handle : windowHandles) {

            driver.switchTo().window(handle);
            // whenever your title equals to your expected window title

            if (driver.getTitle().equals("New Window")){
                // stop on the that window
                break;
            }

        }

        System.out.println("After switch " + driver.getTitle());

    }

}

