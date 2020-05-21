package com.cybertek.day16_homeWork_VyTruck;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homeWork extends TestBaseHw {


    @Test
    public void test1(){

        new LoginPageHw().loginAsStoreManager();

        BrowserUtils.waitFor(3);
        DashBoardPageHw dashBoard = new DashBoardPageHw();

        dashBoard.navigateToModule("Activities", "Calendar Events");

        BrowserUtils.waitFor(5);

        CalendarEventsPageHw calendarEventsPage = new CalendarEventsPageHw();
        BrowserUtils.waitFor(5);


        System.out.println(calendarEventsPage.option.isDisplayed());
        System.out.println("calendarEventsPage.option.getText() = " + calendarEventsPage.option.getText());

    }

    @Test
    public void test2(){

        new LoginPageHw().loginAsStoreManager();

        BrowserUtils.waitFor(3);

        new DashBoardPageHw().navigateToModule("Activities", "Calendar Events");
        CalendarEventsPageHw calendarEventsPage = new CalendarEventsPageHw();
        BrowserUtils.waitFor(3);
        //calendarEventsPage.waitUntilLoaderScreenDisappear();

        String expectedPageNumber = "1";

        String actualPageNumber = calendarEventsPage.numberCalendarEvent.getAttribute("value");
       // int actualPageNumber = Integer.parseInt(actualPageNumberStr);

        System.out.println(actualPageNumber);

        Assert.assertEquals(actualPageNumber,expectedPageNumber,"Verify page number is 1");

    }
    @Test
    public void test3() {

        new LoginPageHw().loginAsStoreManager();

        BrowserUtils.waitFor(3);
        DashBoardPageHw dashBoard = new DashBoardPageHw();

        dashBoard.navigateToModule("Activities", "Calendar Events");

        BrowserUtils.waitFor(3);

        CalendarEventsPageHw calendarEventsPage = new CalendarEventsPageHw();
        String actualVPP= calendarEventsPage.viewPerPage.getText();

        System.out.println("actualVPP = " + actualVPP);
        String expectedVPP = "25";

        Assert.assertEquals(actualVPP,expectedVPP,"Verify View Per Page 25 ");
    }
    @Test
    public void test4() {

        new LoginPageHw().loginAsStoreManager();

        BrowserUtils.waitFor(3);
        DashBoardPageHw dashBoard = new DashBoardPageHw();

        dashBoard.navigateToModule("Activities", "Calendar Events");

        BrowserUtils.waitFor(3);

        CalendarEventsPageHw calendarEventsPage = new CalendarEventsPageHw();

        int currentPage= 1;

        String totalPage = calendarEventsPage.totalPageNumber.getText();

        String [] arr = totalPage.split(" ");

        System.out.println(Arrays.toString(arr));

        int totalPageNumber = Integer.parseInt(arr[1]);


        System.out.println("totalPage = " + totalPage);

          int actualTotalRecordNumber=0;

        while (currentPage<=totalPageNumber){
            BrowserUtils.waitFor(3);
            actualTotalRecordNumber = actualTotalRecordNumber+calendarEventsPage.tableContains.size();
            calendarEventsPage.nextPageButton.click();
            BrowserUtils.waitFor(3);
            currentPage++;

        }
        System.out.println(actualTotalRecordNumber);
        String totalRecord = calendarEventsPage.totalContains.getText();

        String [] arr1 = totalRecord.split(" ");

        System.out.println(Arrays.toString(arr1));

        int expectedTotalRecordNumber = Integer.parseInt(arr1[2]);

        Assert.assertEquals(actualTotalRecordNumber,expectedTotalRecordNumber,"Verify Total Record Number");

    }
    @Test
    public void test5() throws InterruptedException {

            new LoginPageHw().loginAsStoreManager();

            BrowserUtils.waitFor(3);
            DashBoardPageHw dashBoard = new DashBoardPageHw();

            dashBoard.navigateToModule("Activities", "Calendar Events");

            BrowserUtils.waitFor(3);

            CalendarEventsPageHw calendarEventsPage = new CalendarEventsPageHw();

            calendarEventsPage.checkBoxHead.click();
            BrowserUtils.waitFor(3);
            calendarEventsPage.allSelectButton.click();
            BrowserUtils.waitFor(3);


//          Assert.assertTrue(calendarEventsPage.checkBoxHead.isSelected());
//          Thread.sleep(10000);
//          BrowserUtils.waitFor(3);
//
//          Select checkDropdown = calendarEventsPage.checkBoxHeadOptionsList();
//
//            List<String> expectedList = Arrays.asList("All", "All Visible", "None");
//            System.out.println("expectedList.size() = " + expectedList.size());

//            List <WebElement> actualOptions = checkDropdown.getOptions();
//
//              List<String> actualList = new ArrayList<>();
//        for (WebElement option : actualOptions) {
//            actualList.add(option.getText());
//        }

//        List<String> actualList2 =BrowserUtils.getElementsText(actualOptions);
//
//        Assert.assertEquals(actualList2,expectedList,"Verify dropdown options same");

//            int currentPage= 1;
//
//            String totalPage = calendarEventsPage.totalPageNumber.getText();
//
//            String [] arr = totalPage.split(" ");
//
//            System.out.println(Arrays.toString(arr));
//
//            int totalPageNumber = Integer.parseInt(arr[1]);
//
//
//            System.out.println("totalPage = " + totalPage);
//
//            int actualTotalRecordNumber=0;
//
//            while (currentPage<=totalPageNumber){
//                BrowserUtils.waitFor(3);
//                actualTotalRecordNumber = actualTotalRecordNumber+calendarEventsPage.tableContains.size();
//                calendarEventsPage.nextPageButton.click();
//                BrowserUtils.waitFor(3);
//                currentPage++;
//
//            }
//            System.out.println(actualTotalRecordNumber);
//            String totalRecord = calendarEventsPage.totalContains.getText();
//
//            String [] arr1 = totalRecord.split(" ");
//
//            System.out.println(Arrays.toString(arr1));
//
//            int expectedTotalRecordNumber = Integer.parseInt(arr1[2]);
//
//            Assert.assertEquals(actualTotalRecordNumber,expectedTotalRecordNumber,"Verify Total Record Number");




    }



}
