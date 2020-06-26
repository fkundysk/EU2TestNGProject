package com.cybertek.works.codeWars;

import java.util.LinkedHashMap;
import java.util.Map;

public class unique {
    private static Object Integer;

    public static void main(String[] args) {
        uniques("aaabbcccdef");
    }
    private static void uniques(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        for (Map.Entry<String, Integer> each : map.entrySet()) {

            System.out.print(each.getKey() + " = " + each.getValue().toString() + " time(s) ");
            if(each.getValue()==1){
                System.out.println(each.getKey() + " is UNIQUE");
            } else {
                System.out.println(each.getKey() + " is NOT UNIQUE");
            }
        }

//        map.forEach((k, v) -> { if (v == 1) { System.out.print(k); } });

    }
}
