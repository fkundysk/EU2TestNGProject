package com.cybertek.tests.day12_actions_jsexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
  //      driver.quit();
    }
    @Test
    public void hoverTest() throws InterruptedException {


        WebElement img1 = driver.findElement(By.tagName("img"));
        // Actions --> class that  contains all the user interaction
        // how to create actions object / passing driver as a constructor
        Actions actions  = new Actions(driver);

        //perform () --> perform the action, complete the action
        //moveToElement --> move your mouse to web element (hover over)

        actions.moveToElement(img1).perform();
        Thread.sleep(2000);
        WebElement link = driver.findElement(By.linkText("View profile"));

        Assert.assertTrue((link.isDisplayed()),"Verify view profile link displayed");

    }
    @Test
    public void DragAndDrop() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[.='Accept Cookies']")).click();
        actions.dragAndDrop(source, target).perform();

    }

    @Test
    public void DragAndDropChaining(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//*[.='Accept Cookies']")).click();
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        // drag and drop without draganddrop method

        // if you are chaining actions we add build() method before perform()
        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().build().perform();

    }



}
