package org.example.algo.hackerrank;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Clazz2 {// a Very Big Sum, and plus Minus
    public static void main(String[] args) {
        plusMinus(List.of(1,1,0,-1,-1));
    }
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        //logic here
        for (Long num:ar) {
            sum+=num;
        }
        return sum;
    }

    public static void plusMinus(List<Integer> arr) {
        //logic here
        double size = arr.size();//5
        int plus = 0;//2
        int minus = 0;//2
        int zero = 0;//1
        for (Integer num : arr) {
            if (num>0) plus++;
            else if (num<0) minus++;
            else zero++;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        String p = df.format(plus / size);
        String m = df.format(minus / size);
        String z = df.format(zero / size);
        for (String s : Arrays.asList(p,m,z)) {
            System.out.println(s);
        }
    }
}
