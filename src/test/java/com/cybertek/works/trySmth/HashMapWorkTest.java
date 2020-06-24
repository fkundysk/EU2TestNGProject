package com.cybertek.works.trySmth;

import java.util.HashMap;
import java.util.Map;

public class HashMapWorkTest {


        // main method
        public  static  void main ( String [ ] args ){

            HashMap <Integer,Object>map =  new  HashMap ( ) ;

            // Three objects of the class Student are created
            HashMapWorks st1 =  new HashMapWorks ( "Selim" , "Selim" , 12345 ) ;
            HashMapWorks st2 =  new HashMapWorks ( "Yavuz" , "Yavuz" , 12323 ) ;
//            HashMapWorks st3 =  new HashMapWorks ( "Cutlery" , "Maxi" , 12345 ) ;

            // Insert the objects in the HashMap
            // Student number is entered as a key
            map. put ( new Integer ( st1. getMatriculation_number ( ) ) , st1.getName() ) ;
            map. put ( new  Integer ( st2. getMatriculation_number ( ) ) , st2.getName() ) ;

            for (Map.Entry<Integer,Object> each : map.entrySet()){
                System.out.println(each.getKey() + " " + each.getValue());



            }

            // Student st1 is replaced by st3, because the
            // student number is already assigned as a key
//            map. put ( new  Integer ( st3. getMatriculation_number() ) , st3 ) ;
        }
}
