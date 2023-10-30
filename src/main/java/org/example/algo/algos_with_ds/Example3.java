package org.example.algo.algos_with_ds;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        //Find factorial of entered number

        System.out.print("Enter a number: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println(findFactorial(num));;

    }

    private static int findFactorial(int num) {

        if(num == 0 || num == 1) {
            return 1;
        }

        return num * findFactorial(num - 1);

    }
}
