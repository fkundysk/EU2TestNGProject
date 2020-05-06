package com.cybertek.tests.day11_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test(){

        System.out.println(System.getProperty("os.name"));

        // getting project location/path dynamically
        System.out.println(System.getProperty("user.dir"));
        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resourses/Textfile.txt";

        String filePath = projectPath +"/"+relativePath;
        System.out.println("filePath = " + filePath);






    }

}
