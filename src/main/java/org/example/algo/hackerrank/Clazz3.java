package org.example.algo.hackerrank;

public class Clazz3 {// staircase(right)
    public static void main(String[] args) {

        System.out.println(
                func(2)
        );

    }

    public static String func(int num) {
        return num % 15 == 0 ? "success"
                : num % 5 == 0 ? "suc"
                : num % 3 == 0 ? "ces"
                : String.valueOf(num);
    }

}
