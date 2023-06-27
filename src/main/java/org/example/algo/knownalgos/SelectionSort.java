package org.example.algo.knownalgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sortedArr = selectionSort(new int[]{2,3,1});
        System.out.println(Arrays.toString(sortedArr));
    }
    public static int[] selectionSort(int[] arr) {//selection?
        //logic here, look
        boolean isSorted = true;
        for (int key = 0; key < arr.length; key++) {
            int minIndex = key;
            for (int nextKey = key+1; nextKey < arr.length; nextKey++) {
                if (arr[nextKey] < arr[minIndex]) {
                    minIndex = nextKey;
                    isSorted = false;
                }
            }
            if (isSorted){
                System.out.println("Already Sorted");
                return arr;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[key];
            arr[key] = temp;
        }
        return arr;
    }
}
