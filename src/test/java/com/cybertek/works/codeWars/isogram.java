package com.cybertek.works.codeWars;

import java.util.ArrayList;
import java.util.List;

public class isogram {
   /* An isogram is a word that has no repeating letters, consecutive or non-consecutive.
   Implement a function that determines whether a string that contains only letters is an isogram.
   Assume the empty string is an isogram. Ignore letter case.

    isIsogram "Dermatoglyphics" == true
    isIsogram "aba" == false
    isIsogram "moOse" == false -- ignore letter case
    assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""));

    */
   public static void main(String[] args) {
       isIsogram("aba");
   }

       public static boolean  isIsogram(String str) {
           boolean result=false;

           str = str.toLowerCase();

           String[] letters = str.split("");

           List<String> letterList = new ArrayList<>();
           for (String letter : letters) {
               letterList.add(letter);
           }
           System.out.println(letterList.toString());
           for (int i = 0; i<letterList.size();i++) {
               String remove = letterList.remove(i);

               if (letterList.contains(remove)){
                   result=false;
                   break;
               } else {
                   result = true;
                   letterList.add(i,remove);
               }

           }

           return result;
       }



}
