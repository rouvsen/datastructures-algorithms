package org.example.algo.knownalgos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sortedArr = insertionSort(new int[]{2,3,1});
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] insertionSort(int[] arr) {
        //logic here
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];//2nd arg
            int j = i - 1;//first index
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;//j--;
            }
            arr[j + 1] = key;//j = (-1), -1 + 1 = 0, 0th index = second arg
        }
        return arr;
    }
}
