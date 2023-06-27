package org.example.algo.logic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Clazz5 {
    public static void main(String[] args) {
//        method(new int[]{1, 1, 3, 3, 5, 7, 7, 6});
//        find();
//        removeVowels();
        rotateK(null, 1);
    }
    public static void method(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicated = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                duplicated.add(arr[i]);
            }
        }
        System.out.println(duplicated);
    }

    public static void find() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        int size = set1.size();

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(4);

        List<Integer> xx = set1.stream().filter(set2::contains).toList();
        System.out.println(xx);
    }

    public static void removeVowels() {
        String word = "hello";
        //logic
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                stringBuilder.append(c);
            }
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }

    public static void rotateK(int[] nums, int k) {
        int first, last;

        for (int i = 0; i < k; i++) {
            last = nums[nums.length - 1];
            for (first = nums.length - 1; first > 0; first--) {
                nums[first] = nums[first - 1];
            }
            nums[0] = last;
        }
    }

}
