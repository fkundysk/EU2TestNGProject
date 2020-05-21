package com.cybertek.tests.day18_review;

import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class verifyContactInfoTest extends TestBase {

    @Test
    public void contactDetailsTest() {


            extentLogger = report.createTest("Contanct Info Verification");

            LoginPage loginPage = new LoginPage();

            String username = ConfigurationReader.get("salesmanager_username");
            String password = ConfigurationReader.get("salesmanager_password");
            extentLogger.info("username: " + username);
            extentLogger.info("password: " + password);
            extentLogger.info("Login as a Sales Manager");
            loginPage.login(username, password);

            extentLogger.info("Navigate to Customers -- Contacts");
            new DashboardPage().navigateToModule("Customers", "Contacts");

            ContactsPage contactsPage = new ContactsPage();

            extentLogger.info("Click on mbrackstone9@example.com email");
            contactsPage.waitUntilLoaderScreenDisappear();
            contactsPage.getContactEmail("mbrackstone9@example.com").click();


        }

    }
