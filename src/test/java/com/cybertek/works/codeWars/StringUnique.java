package com.cybertek.works.codeWars;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringUnique {
    public static void main(String[] args) {
        String word = "aaaggbbcdddaaeeffffg";

        Map<String, Integer> map=new LinkedHashMap<>();

        String[] arr=word.split("");

        for (int i=0; i<arr.length; i++){

            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        map.forEach((k,v)->{System.out.println("Word contains " + v + " times " + k + " character"); });
    }
}
