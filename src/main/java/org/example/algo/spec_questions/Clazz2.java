package org.example.algo.spec_questions;

import java.util.Objects;

public class Clazz2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("coffoc"));
        System.out.println(testPalindrome("coffoc"));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int len = str.length();
        char[] chars = str.toCharArray();
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean testPalindrome(String word) {
        if (Objects.isNull(word) || word.isEmpty()) {
            return false;
        }

        int len = word.length();

        char[] chars = word.toCharArray();

        for (int i = 0; i < len / 2; i++) {
            if(chars[i] != chars[len - 1 - i]) {
                return false;
            }
        }

        return true;
    }

}
