package org.example.algo.knownalgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] sortedArr = bubbleSort(new int[]{3, 1, 4, 2, 7, -2});
        int[] sortedArr = bubbleSort(new int[]{1,2,3});
        System.out.println(Arrays.toString(sortedArr));
    }
    public static int[] bubbleSort(int[] arr) {//bubble?
        //logic here
        boolean isSorted = true;
        int temp;
        for (int key = 0; key < arr.length-1; key++) {
            for (int nextVal = key+1; nextVal < arr.length; nextVal++) {
                if (arr[nextVal] < arr[key]) {
                    //swapping
                    temp = arr[key];
                    arr[key] = arr[nextVal];
                    arr[nextVal] = temp;
                    isSorted = false;
                }
            }
            //i=key, j=nextVal
            if (isSorted) {
                System.out.println("Already Sorted");
                return arr;
            }
        }
        return arr;
    }
}
