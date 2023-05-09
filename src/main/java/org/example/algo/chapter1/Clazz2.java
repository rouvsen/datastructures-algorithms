package org.example.algo.chapter1;

import java.util.*;

public class Clazz2 {
    public static void main(String[] args) {
        int[] nums = {11,2,2,3,3,8,5,5,11,7};
        Set<Integer> singleValues = findSingleVal(nums);
        System.out.println(Arrays.toString(singleValues.toArray()));
    }

    public static Set<Integer> findSingleVal(int[] arr) {
        //logic
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicated = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])){
                duplicated.add(arr[i]);
            }
        }
//        int single = -1;
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!duplicated.contains(arr[i])){
                uniques.add(arr[i]);
            }
        }
        return uniques;
    }

}
