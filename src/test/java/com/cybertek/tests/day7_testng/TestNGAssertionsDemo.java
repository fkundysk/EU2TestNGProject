package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals("title","tiTle", "verify title");

        System.out.println("Second Assertion");
        Assert.assertEquals(1,1);

        //driver.quit

    }
   // @Ignore
    @Test
    public void test2(){
        System.out.println("Second Test Case");
        Assert.assertEquals("url","urn");
//        SoftAssert soft = new SoftAssert();
//        soft.assertEquals("url", "urn");
        System.out.println("after test assert");

    }

    @Test
    public void test3(){
        String expectedTitle = "Cyb";
        String actualTitle = "Cybertek";

        // verify that your ttle starting with Cyb

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title start with Cyb");
        Assert.assertTrue(1>1, "i am checking is 2 greater than 1");

    }

    @Test
    public void test4(){
        //verify that mail contains @

        String email = "mikesmith.com";
        Assert.assertTrue(email.contains("@"), "Verify email has @ sign");

    }
    @Test
    public void test5(){
        // Verify something is false

        Assert.assertFalse(0>1, "Verify that O is not greater than 1");
    }

    @Test
    public void test6(){

        Assert.assertNotEquals("one","two");

    }


}
