package org.example.algo.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clazz1 {// compare Triplets
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(10);
        nums1.add(5);
        nums1.add(3);
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(7);
        nums2.add(5);
        nums2.add(1);
        List<Integer> result = compareTriplets(nums1, nums2);
        System.out.println(result);
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int sumFor1 = 0;
        int sumFor2 = 0;
        //logic here
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                sumFor1++;
            } else if (a.get(i) < b.get(i)) {
                sumFor2++;
            }
        }
        return Arrays.asList(sumFor1, sumFor2);
    }
}
