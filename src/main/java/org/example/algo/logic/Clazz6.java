package org.example.algo.logic;

import java.util.Arrays;

public class Clazz6 {
    public static void main(String[] args) {
        int[] reversedArr = reverseArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(reversedArr));
    }

    public static int[] reverseArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return arr;
    }
}
