package org.example.algo.knownalgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sortedArr = selectionSort(new int[]{3, 1, 4, 2, 7, -2});
        System.out.println(Arrays.toString(sortedArr));
    }
    public static int[] selectionSort(int[] arr) {
        //logic here
        int temp;
        for (int key = 0; key < arr.length; key++) {
            for (int nextVal = key+1; nextVal < arr.length; nextVal++) {
                if (arr[nextVal] < arr[key]) {
                    //swapping
                    temp = arr[key];
                    arr[key] = arr[nextVal];
                    arr[nextVal] = temp;
                }
            }
            //i=key, j=nextVal
        }
        return arr;
    }
}
