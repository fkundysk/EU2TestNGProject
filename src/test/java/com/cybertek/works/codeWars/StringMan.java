package com.cybertek.works.codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringMan {
/*
    Write a function that takes in a string of one or more words,
    and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata).
    Strings passed in will consist of only letters and spaces. Spaces will be included
    only when more than one word is present.

    Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
    spinWords( "This is a test") => returns "This is a test"
    spinWords( "This is another test" )=> returns "This is rehtona test"
  */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Sentence : ");
        String sentence = sc.nextLine();

        reverseMoreFive(sentence);


    }

    private static void reverseMoreFive(String sentence) {

        String newSentence= "";
        String [] eachWord = sentence.split(" ");
        System.out.println("eachWord = " + Arrays.toString(eachWord));

        for (String  each: eachWord ) {
            if(each.length()>=5){
             StringBuilder sb = new StringBuilder();
             newSentence = newSentence + " " + sb.append(each).reverse();

            } else {
                newSentence = newSentence + " " + each;
            }
        }
        System.out.println(newSentence);
    }

}



