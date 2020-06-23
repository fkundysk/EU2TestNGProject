package com.cybertek.works;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deneme1 {
    public static void main(String[] args) {

        Map<String, Object> list = new HashMap<>();
        List<Map<String, Object>> list2 = new ArrayList<>();


            list.put("a", "bb");
            list.put("b", "bb");
            list.put("c", "bb");
            list.put("d", "bb");
        System.out.println(list);

        for (Map.Entry<String, Object> row: list.entrySet()) {
            System.out.println(row.getKey() + " = $ " + row.getValue());
            System.out.println(row.toString().replace("=", "=$"));
        }
        for (Map<String,Object> row: list2) {
            System.out.println(row.toString().replace("=", "=$"));
        }

        System.out.println("list.entrySet() = " + list.entrySet());
        System.out.println("list = " + list);
        list2.add(list);
        System.out.println(list2);

    }
}
