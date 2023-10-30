package org.example.algo.algos_with_ds;

public class Example2 {
    public static void main(String[] args) {

        //Find min val in the Array

        int [] arr = {1,5,7,-77,-200,23,63,62,1,-10,6, -100};

        System.out.println(findArrMinimumVal(arr));

    }

    private static int findArrMinimumVal(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;

    }
}
