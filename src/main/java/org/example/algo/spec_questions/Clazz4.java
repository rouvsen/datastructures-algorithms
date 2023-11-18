package org.example.algo.spec_questions;

public class Clazz4 {
    public static void main(String[] args) {
        System.out.println(reverseNumbers(1234567));
    }

    private static Integer reverseNumbers(int num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        String s = new String(chars);
        return Integer.parseInt(s);
    }
}
