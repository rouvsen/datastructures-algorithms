package org.example.algo.knownalgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = {1,3,2,6,11,5};
        int[] ints = bubbleSort(nums);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] bubbleSort(int[] arr){
        int[] array = arr;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
