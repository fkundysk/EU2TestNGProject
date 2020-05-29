package com.cybertek.tests.day19_ddf;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {


    @DataProvider
    public Object [][] userData(){
        ExcelUtil qa3short = new ExcelUtil("src/test/resourses/Vytracktestdata.xlsx","QA3-short");
        String [][] dataArray = qa3short.getDataArrayWithoutFirstRow();

        return dataArray;
    }
    @Test (dataProvider = "userData")
    public void loginTestDDF(String username, String password, String firstname, String lastname){
        extentLogger=report.createTest("Test " + firstname + " " + lastname);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();

        String actualFullName = dashboardPage.getUserName();
        String expectedFullName = firstname + " " + lastname;

        Assert.assertEquals(actualFullName,expectedFullName,"Verify name of login User");
        extentLogger.pass("PASS");


    }

}
