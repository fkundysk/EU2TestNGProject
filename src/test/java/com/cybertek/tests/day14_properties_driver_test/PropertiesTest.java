package com.cybertek.tests.day14_properties_driver_test;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void test1(){

        String browser = ConfigurationReader.get("browser");
        System.out.println("browser = " + browser);

        System.out.println(ConfigurationReader.get("salesmanager_username"));
        System.out.println(ConfigurationReader.get("browser"));


    }

}