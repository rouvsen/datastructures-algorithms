package org.example.algo.logic;

import java.util.Arrays;

public class Clazz3 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7, 11, 25, 4, 2, 1};
        int[] nums = {3, 8, 2, 10, 5, 1};

        int[] maxTwoValues = findMaxTwoValues(nums);
        System.out.println(Arrays.toString(maxTwoValues));

        int[] maxTwoValues2 = findMaxTwoValues2(nums);
        System.out.println(Arrays.toString(maxTwoValues2));
    }
    public static int[] findMaxTwoValues(int[] arr) {
        //logic
        int max = Integer.MIN_VALUE;
        int[] maxes = new int[2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        maxes[0] = max;
        arr[index] = 0;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        maxes[1] = max;
        return maxes;
    }
    public static int[] findMaxTwoValues2(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[1];
        for (int j : arr) {
            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2) {
                max2 = j;
            }
        }
        return new int[]{max1, max2};
    }
}
