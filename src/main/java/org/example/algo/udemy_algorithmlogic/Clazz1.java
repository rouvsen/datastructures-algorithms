package org.example.algo.udemy_algorithmlogic;

import java.util.Scanner;

public class Clazz1 {

    public static void main(String[] args) {
//        squareOfNumbersBetweenXandY(5, 10);//all are inclusive
//        findFactorialSimpleV1(5);
//        System.out.println(findFactorialSimpleV2(5));
//        findFactorialForGivenNumbersButTheirsAmong(5, 10);
//        sumAndAverage();
        primeNumbersFinder(5, 10);
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

    public static void findFactorialForGivenNumbersButTheirsAmong(int num1, int num2) {
        int period = num1;

        while(period <= num2) {
            //for each Period
            int counter = 1;
            int number = period;
            while (number > 1) {
                counter *= number--;
            }
            System.out.println("factorial of " + number + " is " + counter);

            period++;
        }

    }

    public static void sumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many num? ");
        int howMany = scanner.nextInt();
        int sum = 0;
        int average;
        for (int i = 0; i < howMany; i++) {
            System.out.print(i + 1 + " num is: ");
            int num = scanner.nextInt();
            sum+=num;
        }
        average = sum / howMany;
        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
    }

    public static void primeNumbersFinder(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
