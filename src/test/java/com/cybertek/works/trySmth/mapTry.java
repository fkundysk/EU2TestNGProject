package com.cybertek.works.trySmth;

import java.util.*;

public class mapTry {

        public static void main(String[] args) {
//            Map m1 = new HashMap();
//            m1.put("Zara", "8");
//            m1.put("Mahnaz", "31");
//            m1.put("Ayan", "12");
//            m1.put("Daisy", "14");
//            System.out.println();
//            System.out.println(" Map Elements");
//            System.out.print("\t" + m1);
//
//            HashMap m2 = new HashMap();
//
//            m2.put(12,"Yavuz");
//            m2.put(13, "Ahmet");
//            System.out.println("=====================");
//            System.out.println(m2);

            Map<Integer,Map<String,String>> m3 = new HashMap<>();
            forTries exp1 = new forTries("Ahmet","Sezgin");

            m3.put(2,new HashMap(){{put("first_name",exp1.getFirstName());}});

            System.out.println(m3.get(2));

            }

    }

