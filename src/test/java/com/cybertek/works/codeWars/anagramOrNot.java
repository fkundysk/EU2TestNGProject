package com.cybertek.works.codeWars;

import com.google.common.primitives.Chars;

import java.util.ArrayList;
import java.util.Arrays;

public class anagramOrNot {

    public static void main(String[] args) {

        String str1 = "Keep";
        String str2 = "Peek";

        System.out.println( str1 + " and " + str2 + " is Anagram  : "  + isAnagram(str1, str2));

    }

    public static boolean isAnagram(String str1, String str2) {
         boolean check = false;

         str1= str1.toLowerCase().replace(" ", "");
         str2 = str2.toLowerCase().replace(" ", "");

        char [] charStr1 = str1.toCharArray();
        char [] charStr2 = str2.toCharArray();

         if (str1.length()!=str2.length()){
             return check;
         }else {
            Arrays.sort(charStr1);
            Arrays.sort(charStr2);
            check = Arrays.equals(charStr1,charStr2);

         }
         return check;
    }

}
