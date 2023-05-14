package org.example.algo.knownalgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sortedArr = bubbleSort(new int[]{3, 1, 4, 2, 7, -2});
        System.out.println(Arrays.toString(sortedArr));
    }
    public static int[] bubbleSort(int[] arr) {//bubble?
        //logic here
        int temp;
        for (int key = 0; key < arr.length-1; key++) {
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
