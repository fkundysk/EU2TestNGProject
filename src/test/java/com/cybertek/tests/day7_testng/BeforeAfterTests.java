package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;


public class BeforeAfterTests {

   @Test
    public void test1() {

        // WebDriver Part

       System.out.println("This is may test 1");
        // cloe browser, quit

    }
    @Ignore
    @Test
    public void test2(){

        System.out.println("This is my test 2");

    }

    @Test
    public void test3(){

        System.out.println("This is my test 3");
    }

    @BeforeMethod
    public void setup() {

       // WebDriver Part

        System.out.println("BEFORE METHOD HERE");
        System.out.println("WebDriver Part");

    }

    @AfterMethod
    public void tearDown() {
        // Quit

        System.out.println("AFTER METHOD HERE");
        System.out.println("Driver Quit");
    }

    @BeforeClass
    public void setupClass(){
        System.out.println("=====RUNS ONLY ONCE BEFORE EVERYTHING IN THE CLASS======");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("=======RUNS ONLY ONCE BEFORE EVERYTHING IN THE CLASS========");

    }


}