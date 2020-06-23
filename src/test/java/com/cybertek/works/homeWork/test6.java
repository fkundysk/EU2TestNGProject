package com.cybertek.works.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test6 {

    @Test
    public void test6() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tempmailaddress.com");

        String emailAddress = driver.findElement(By.xpath("//*[@id='email']")).getText();

        System.out.println("emailAddress = " + emailAddress);

        driver.get("https://practice-cybertekschool.herokuapp.com/");

       driver.findElement(By.linkText("Sign Up For Mailing List")).click();

       driver.findElement(By.name("full_name")).sendKeys("Mike Smith");
       driver.findElement(By.name("email")).sendKeys(emailAddress);
       driver.findElement(By.name("wooden_spoon")).click();
       String actualMessage = driver.findElement(By.name("signup_message")).getText();
       String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
       Assert.assertEquals(actualMessage,expectedMessage,"Verify Sign up message");

       driver.get("https://www.tempmailaddress.com");

       String actualReplyMessage = driver.findElement(By.xpath("//td[contains(text(),'do-not-reply@')]")).getText();
       String expectedReplyMessage = " do-not-reply@practice.cybertekschool.com";

       Assert.assertEquals(actualReplyMessage,expectedReplyMessage,"Verify that mail from message");

      String actualMailSubject = driver.findElement(By.xpath("//td[contains(text(),'Thanks')]")).getText();
      String expectedMailSubject = "Thanks for subscribing to practice.cybertekschool.com!";

       Assert.assertEquals(actualMailSubject,expectedMailSubject,"Verify subject of mail");

       // Thread.sleep(3000);
      // driver.quit();
    }





}
