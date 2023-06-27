package org.example.algo.udemy_algorithmlogic;

public class Clazz1 {

    public static void main(String[] args) {
//        squareOfNumbersBetweenXandY(5, 10);//all are inclusive
//        findFactorialSimpleV1(5);
        System.out.println(findFactorialSimpleV2(5));
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

    public static void findFactorialSimpleV1(int num) {
        int counter = 1;//5
        int number = num;
        while (num > 1) {
            counter *= num--;
        }
        System.out.println("factorial of " + number + " is " + counter);
    }

    public static int findFactorialSimpleV2(int num) {
        if(num == 0)
            return 1;
        return num * findFactorialSimpleV2(num - 1);
    }

}
