package com.cybertek.works.codeWars;
/*
* Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit,
* continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

* */

public class DRootExampleTest {

    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }


    public static int digital_root(int n) {
        Integer numberTotal=0;
        Integer number = n;
        String num = number.toString();
        String [] nums = num.split("");

        while (nums.length>1) {

            for (int i = 0; i < nums.length; i++) {
                numberTotal = numberTotal + Integer.parseInt(nums[i]);
            }
            if (numberTotal > 9) {
                number = numberTotal;
                numberTotal = 0;
                num = number.toString();
                nums = num.split("");
            } else {

                break;
            }

        }
        return numberTotal;
    }
}

//    public static int digital_root(int n) {
//
//        while(n > 9) {
//            n = n/10 + n % 10;
//
//        }
//        return(n);
//    }