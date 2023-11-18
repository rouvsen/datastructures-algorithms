package org.example.algo.spec_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Clazz5 {
    public static void main(String[] args) {

        //find Duplicates
//        int[] arr = {1,2,3,3,2,5,6,7,10,5,22,13};
//        System.out.println(findDuplicatedNums(arr));

        //find long word in sentence
//        System.out.println(findLongWord("Menim adim Rovshandir"));

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(swapHalf(arr)));
    }

    public static int[] swapHalf(int[] array) {
        int len = array.length;
        int half = len / 2;
        for (int i = 0; i < half; i++) {
            int temp = array[i];
            array[i] = array[half + i];
            array[half + i] = temp;
        }
        if (len % 2 == 1) {
            int temp = array[half];
            array[half] = array[len - 1];
            int temp2 = array[half + 1];
            array[half + 1] = temp;
            array[len - 1] = temp2;
        }
        return array;
    }

    public static Set<Integer> findDuplicatedNums(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicated = new HashSet<>();
        for (int el : arr) {
            if (!set.add(el)) {
                duplicated.add(el);
            }
        }
        return duplicated;
    }

    public static String findLongWord(String sentence) {
        String max = "";
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].length() > strings[i + 1].length()) {
                max = strings[i];
            } else {
                max = strings[i + 1];
            }
        }
        return max;
    }
}
