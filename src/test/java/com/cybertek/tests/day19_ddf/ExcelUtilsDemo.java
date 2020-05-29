package com.cybertek.tests.day19_ddf;

import com.cybertek.utilities.ExcelUtil;
import net.bytebuddy.build.ToStringPlugin;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {

    @Test
    public void readExcelFile(){

        //create an object from ExcelUtil
        //it accepts two argument
        //Argument 1: location of the file(path)
        //Argument 2:sheet that we want to open(sheetName)

        ExcelUtil qa3short = new ExcelUtil("src/test/resourses/Vytracktestdata.xlsx","QA3-short");

        //how many rows in the sheet
        System.out.println("qa3short.rowCount() = " + qa3short.rowCount());

        //how many columns in the sheet
        System.out.println("qa3short.columnCount() = " + qa3short.columnCount());

        //get all column names
        System.out.println("qa3short.getColumnsNames() = " + qa3short.getColumnsNames());

        //get all data in list of maps
        List<Map<String, String>> dataList = qa3short.getDataList();
        System.out.println(dataList.get(2)); //get value of index of 2 row
        System.out.println(dataList.get(2).get("firstname"));//get value of firstname(key) of index 2 row
        System.out.println(dataList.get(5).get("username"));//get value of username(key) of index 2 row

        for (Map<String, String> oneRow : dataList) {
            System.out.println(oneRow);
        }

        System.out.println(dataList.get(8));// get value of index of 2 row


        //get all data in 2d array
        String[][] dataArray = qa3short.getDataArray();
        for (int i=0; i<dataArray.length;i++){ // her bir row icerigini tek tek toString metodu ile yazdirmak
            System.out.println(Arrays.toString(dataArray[i]));
        }
         System.out.println(Arrays.deepToString(dataArray)); // 2d arrayslerde array icerigini yadirmak icin deepToString metodu kullaniyoruz


    }
}