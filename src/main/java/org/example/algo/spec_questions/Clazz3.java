package org.example.algo.spec_questions;

public class Clazz3 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        return num * factorial(num - 1);
    }
}
