package com.cybertek.works.day16_homeWork_VyTrack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsInformationPage extends BasePageHw {

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement title;

//    @FindAll({
       @FindBy(xpath = "//div[@class='control-group attribute-row']")
      //  @FindBy(xpath = "//div[contains(text(),'Testers meeting')]")
//    })
    public WebElement firstRow;



}
