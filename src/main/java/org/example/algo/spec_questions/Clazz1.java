package org.example.algo.spec_questions;

import java.util.Objects;

public class Clazz1 {
    public static void main(String[] args) {
        System.out.println(reverseString("this is test message"));
        System.out.println(testReverse("this is test message"));
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int len = str.length();
        char[] chars = str.toCharArray();
        for (int i = 0; i < len / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[len - 1 - i];
            chars[len - 1 - i] = temp;
        }
        return new String(chars);
    }

    public static String testReverse(String word) {

        if(Objects.isNull(word) || word.isEmpty())
            return word;

        int len = word.length();

        char[] chars = word.toCharArray();

        for (int i = 0; i < len / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[len - 1 - i];
            chars[len - 1 - i] = temp;
        }

        return new String(chars);
    }
}
