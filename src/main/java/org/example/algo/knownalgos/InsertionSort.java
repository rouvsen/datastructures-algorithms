package org.example.algo.knownalgos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sortedArr = insertionSort(new int[]{2,3,1});
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] insertionSortPractice(int[] arr) {
        //logic here, write :)

        return arr;
    }

    private static int[] insertionSort(int[] arr) {
        //logic here, look
        for (int i = 1; i < arr.length; ++i) {
            int nextArg = arr[i];//second arg.
            int firstArg = i - 1;//first arg.
            while (firstArg >= 0 && arr[firstArg] > nextArg) {//first > second
                arr[firstArg + 1] = arr[firstArg];//
                firstArg = firstArg - 1;//j=-1
            }
            arr[firstArg + 1] = nextArg;//
        }
        //write like this
        return arr;
    }
}
