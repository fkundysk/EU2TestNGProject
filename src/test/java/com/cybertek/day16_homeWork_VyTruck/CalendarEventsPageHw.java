package com.cybertek.day16_homeWork_VyTruck;

import com.cybertek.pages.BasePage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalendarEventsPageHw extends BasePage {
    public CalendarEventsPageHw() {

        PageFactory.initElements(Driver.get(), this);//label[@class='control-label']/..//button
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement numberCalendarEvent;

    @FindBy(xpath = "//div[@class='btn btn-link dropdown-toggle']")
    public WebElement option;

    @FindBy(xpath ="//label[@class='control-label']/..//button")
    public WebElement viewPerPage;

    @FindBy(xpath = "//label[contains(text(),'Total')]")
    public WebElement totalContains;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> tableContains;

    @FindBy(xpath = "//label[contains(text(),'of')][1]")
    public WebElement totalPageNumber;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement currentPage;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement nextPageButton;

    @FindBy(xpath = "((//table/thead)[1]//i)[1]")
    public WebElement checkBoxHead;

    @FindBy(xpath = "(//a[.='All'])[2]")
    public WebElement allSelectButton;

//    public Select checkBoxHeadOptionsList(){
//
//        return new Select(checkBoxHead);
//    }



}
