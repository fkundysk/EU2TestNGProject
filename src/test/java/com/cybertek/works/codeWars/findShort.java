package com.cybertek.works.codeWars;

public class findShort {
//
//    Simple, given a string of words, return the length of the shortest word(s).
//
//    String will never be empty and you do not need to account for different data types.
//assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
//    assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));

    public static void main(String[] args) {

        findShortestWord("turns out random test cases are easier than writing out basic ones");


    }

    private static void findShortestWord(String str) {

        String [] words = str.split(" ");

        int shortest = words[0].length();

        for (String each : words) {
            if (shortest>each.length()){
                shortest = each.length();
            }
        }
        System.out.println(shortest);

    }

}
