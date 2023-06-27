package org.example.algo.udemy_algorithmlogic;

public class Clazz1 {
    public static void main(String[] args) {
        squareOfNumbersBetweenXandY(5, 10);//all are inclusive
    }
    public static void squareOfNumbersBetweenXandY(int num1, int num2) {
        int counter = 0;
        for (int i = num1; i <= num2; i++) {
            counter += i * i;
            System.out.println("num: " + i);
        }
        System.out.println("square of all nums and sum - between " + num1 + " and " + num2
                + ", result: " + counter);
    }
}
