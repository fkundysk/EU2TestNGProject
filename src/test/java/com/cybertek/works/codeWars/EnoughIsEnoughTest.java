package com.cybertek.works.codeWars;

//Enough is enough!
//        Alice and Bob were on a holiday. Both of them took many pictures of the places
//        they've been, and now they want to show Charlie their entire collection.
//        However, Charlie doesn't like these sessions, since the motive usually repeats.
//        He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will
//        only sit during the session if they show the same motive at most N times. Luckily,
//        Alice and Bob are able to encode the motive as a number. Can you help them to remove
//        numbers such that their list contains each number only up to N times, without changing the order?
//
//        Task
//        Given a list lst and a number N, create a new list that contains each number
//        of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3],
//        you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times,
//        and then take 3, which leads to [1,2,3,1,2,3].
//
//        Example
//        EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
//        EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]

import java.util.*;

public class EnoughIsEnoughTest {

    public static void main(String[] args) {


        deleteNth(new int[] {20,37,20,21}, 1 );
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> lastList = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {

            if (!map.containsKey(elements[i])) {
                map.put(elements[i],1);
                if (map.get(elements[i]) <= maxOccurrences) {
                    lastList.add(elements[i]);
                }
            } else {
                map.put(elements[i], map.get(elements[i]) + 1);
                if (map.get(elements[i]) <= maxOccurrences) {
                    lastList.add(elements[i]);
                }
            }

        }
        System.out.println(lastList.size());
        int [] elements2 = new int[lastList.size()];
        for (int i=0; i<lastList.size();i++) {
           elements2[i] = lastList.get(i);
        }
        System.out.println(elements.length);
        System.out.println(lastList.toString());
        return elements2;



//        for (int i=0; i<elements.length; i++){
//
//            if(!map.containsKey(elements[i])){
//                map.put(elements[i], 1);
//            }
//            else{
//
//            }
//        }
//        map.forEach((k,v)->{System.out.println("Word contains " + v + " times " + k + " character"); });
//        return null;


    }

}
//
//    public static int[] deleteNth(int[] elements, int max) {
//
//        if (max < 1) return new int[0];
//
//        final HashMap<Integer,Integer> map = new HashMap<>();
//        final List<Integer> list = new ArrayList<>();
//
//        for (final Integer i : elements) {
//            final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
//            if (v == null || v < max) list.add(i);
//        }
//
//        return list.stream().mapToInt(i->i).toArray();
//    }
//
//}


//import java.util.HashMap;
//import java.util.Map;
//import java.util.stream.IntStream;
//
//public class EnoughIsEnough {
//  public static int[] deleteNth(int[] elements, int maxOccurrences) {
//    Map<Integer, Integer> occurrence = new HashMap<>();
//    return IntStream.of(elements)
//      .filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
//      .toArray();
//  }
//}


//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//class EnoughIsEnough {
//    private static boolean shouldAdd(final Map<Integer, Integer> counts, final int element, final int maxOcurrences) {
//        if (counts.getOrDefault(element, 0) < maxOcurrences) {
//            counts.merge(element, 1, Integer::sum);
//            return true;
//        }
//        return false;
//    }
//
//    static int[] deleteNth(final int[] elements, final int maxOcurrences) {
//        final Map<Integer, Integer> counts = new HashMap<>();
//        return Arrays.stream(elements)
//            .filter(element -> shouldAdd(counts, element, maxOcurrences))
//            .toArray();
//    }
//}

//import java.util.*;
//
//public class EnoughIsEnough {
//
//    public static int[] deleteNth(int[] elements, int maxOcurrences) {
//        Map<Integer, Integer> counts = new HashMap<>();
//        int dest = 0;
//        for (int val : elements) {
//            int qty = counts.getOrDefault(val, 0);
//            if (++qty <= maxOcurrences) {
//                elements[dest++] = val;
//            }
//            counts.put(val, qty);
//        }
//        return Arrays.copyOfRange(elements, 0, dest);
//    }
//}
//
// import java.util.Arrays;
//import java.util.HashMap;
//
//public class EnoughIsEnough {
//
//  public static int[] deleteNth(int[] elements, int maxOcurrences) {
//    //Code here ;)
//    HashMap<Integer, Integer> map = new HashMap<>();
//    return Arrays.stream(elements)
//      .filter(i -> {
//          map.merge(i, 1, Integer::sum);
//          return map.get(i) <= maxOcurrences;
//        })
//      .toArray();
//  }
//
//}


