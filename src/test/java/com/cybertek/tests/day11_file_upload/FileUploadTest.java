package com.cybertek.tests.day11_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {

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
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        // sending file
        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resourses/testfile.txt";

        String filePath = projectPath +"/"+relativePath;
        System.out.println("filePath = " + filePath);

        chooseFile.sendKeys(filePath);

        // clicking upload button

        driver.findElement(By.id("file-submit")).click();

        String expectedMessage = "File Uploaded!";

        String actualMessage = driver.findElement(By.xpath("//h3")).getText();

        Assert.assertEquals(actualMessage,expectedMessage,"Verify the confirmation message");


        String expectedFileName = "testfile.txt";
        // getting name of the file
        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
        // verify file's names are same
        Assert.assertEquals(actualFileName,expectedFileName,"Verify the uploaded file name");
    }


}
