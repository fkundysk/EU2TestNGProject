package com.cybertek.works.day16_homeWork_VyTrack;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHw {

    public LoginPageHw(){
        PageFactory.initElements(Driver.get(),this);
    }

    //same with driver.findElement(By.id("prependedInput"));
    @FindAll({
            //  @FindBy(id = "prependedInput"),
            // @FindBy(name = "_username"),
            @FindBy(xpath = "//input[@id='prependedInput']"),
            @FindBy(xpath = "//input[@name='_username']"),

    })
    public WebElement usernameInput;

    //@FindBy(id = "prependedInput2")
    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement passwordInput;

    //@FindBy(id = "_submit")
    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginBtn;

    public void login(String usernameStr,String passwordStr){

        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();

    }


    public void loginAsStoreManager(){
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

}
