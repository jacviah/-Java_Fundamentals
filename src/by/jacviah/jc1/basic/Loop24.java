package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Loop24 {

    public static void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = inputIntNumber(sc);
        int a = 0;
        int sum = 0;
        int reverseNumber = 0;
        while (n > 0) {
            a = n % 10;
            if (a % 2 == 0) {
                sum += a;
            }
            reverseNumber = reverseNumber * 10 + a;
            n = n / 10;
        }
        System.out.printf("the sum even digits of natural number is %d, reverse number is %d %n", sum, reverseNumber);
    }
}
