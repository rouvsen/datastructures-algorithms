package org.example.algo.chapter1;

import java.util.Arrays;

public class Clazz1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        int[] result = addNumToThirdIndexOfArr(nums, 4);

        assert result != null;

        Arrays.stream(result).forEach(
                System.out::println
        );
    }

    public static int[] addNumToThirdIndexOfArr(int[] arr, int num) {
        int[] newArr = new int[arr.length+1];

        for (int i = 0; i < 3; i++) {
            newArr[i] = arr[i];
        }

        newArr[3] = num;

        for (int i = 3; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        return newArr;
    }
}
