package com.cybertek.tests.day16_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {


    /**
     * Test case
     * Open Browser
     * Login as a driver
     * Verify that page Subtitle is Quick Launchpad
     * Go to activities --> Calendar Events
     * Verify that page subtitle is Calendar Events
     */

    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsDriver();

        //Thread.sleep(3000);
        BrowserUtils.waitFor(3);

        DashboardPage dashboardPage = new DashboardPage();

        String expectedSubtitle = "Quick Launchpad";

        String actualSubtitle= dashboardPage.getPageSubTitle();

        Assert.assertEquals(actualSubtitle, expectedSubtitle);
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        BrowserUtils.waitFor(3);

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(), "Calendar Events", "verify subtitle");



    }


}
