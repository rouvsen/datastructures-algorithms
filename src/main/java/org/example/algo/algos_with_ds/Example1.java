package org.example.algo.algos_with_ds;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

    public static void main(String[] args) {

        //Find letters count in the word

        String s = "Azerbaycan";

        s = s.toLowerCase();

        char[] arr = s.toCharArray();

        int count = 1;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : arr) {
            if (!map.containsKey(c)) {
                map.put(c, count);
            } else {
                int val = map.get(c);
                val++;
                map.put(c, val);
            }
        }

        System.out.println(map);
    }
}
