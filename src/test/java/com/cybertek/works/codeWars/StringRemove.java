package com.cybertek.works.codeWars;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringRemove {
    public static void main(String[] args) {
        String str1 = "Yu1s3uf5";
        System.out.println(removeDigits(str1));
        String str2 = "if it is hot I will go to swimming pool tomorrow if it not I will stay home";
        freq(str2);
    }
    private static void freq(String str) {
        String[] arr = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        map.forEach((number, frequency) -> {
            System.out.println(number + " - " + frequency);
        });
    }
    private static String removeDigits(String str) {
        String letters = "";
        for (String s : str.split("[0-9]")) {
            letters += s;
        }
        return letters;
    }
}
