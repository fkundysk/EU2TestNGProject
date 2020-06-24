package com.cybertek.works.trySmth;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder str = new java.lang.StringBuilder("");
        String s = "HAVA";

        System.out.println(str.append(s));
        System.out.println(str.append("Murat"));
//        System.out.println(str.reverse());
        System.out.println(str.replace(0, 3, "Selim"));
        System.out.println(str);

         s= str.toString();
        System.out.println(s);

    }
}
