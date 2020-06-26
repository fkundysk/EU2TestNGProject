package com.cybertek.works.codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMan2 {
    /*
    * The goal of this exercise is to convert a string to a new string where each character in
    * the new string is "(" if that character appears only once in the original string, or ")"
    * if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

    Examples
    "din"      =>  "((("
    "recede"   =>  "()()()"
    "Success"  =>  ")())())"
    "(( @"     =>  "))(("
    Notes

* assertEquals(")()())()(()()(",
            DuplicateEncoder.encode("Prespecialized"));
      assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
    *
    * */
    public static void main(String[] args) {
        String word = "(()(()()(()()(";
        word = word.toLowerCase();
        encode(word);

    }
    static String encode(String word){
        String encode= "";
        String[] letters = word.split("");
        List<String> letterList = new ArrayList<>();
        for (String letter : letters) {
            letterList.add(letter);
        }
        for (int i = 0; i<letterList.size();i++) {
            String remove = letterList.remove(i);
            if (letterList.contains(remove)){
                encode = encode + ")";
            }else {
                encode = encode + "(";
            }
            letterList.add(i,remove);
        }

        System.out.println(encode);

        return word;
    }
}

//            System.out.println(newWord);
//        }
//
//        String[] letters = word.split("");
//        int wordLength = word.length();
//
//
//
//
//
//        for (int i=0; i<1; i++) {
//           String subWord = word.substring(i + 1);
//            if (subWord.contains(letters[i])) {
//                encode = ")";
//            } else {
//                encode = "(";
//            }
//        }

//        for (int i=0; i<letters.length-1; i++) {
//
//            String subWord = word.substring(i + 1);
//            if (subWord.contains(letters[i])){
//                encode = encode + ")";
//            } else {
//                encode = encode + "(";
//            }
//        }
//
//
//        if(word.substring(0,word.length()-1).contains(""+word.charAt(word.length()-1))){
//            encode = encode + ")";
//        } else {
//            encode = encode + "(";
//        }

// for (int i =0; i<word.length();i++) {
//        String remove = word.charAt(i) +"";
//        String newWord = word.replace(remove,"");
//        System.out.println("newWord = " + newWord);
//        System.out.println(remove);
//        if(newWord.contains(remove)){
//        encode = encode + ")";
//        } else {
//        encode = encode + "(";
//        }
//        System.out.println("encode = " + encode);
//        }
