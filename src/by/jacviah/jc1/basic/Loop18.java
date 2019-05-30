package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputDoubleNumber;

public class Loop18 {

    public static void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter eps: ");
        double eps = inputDoubleNumber(sc);

        int sum = 0;
        double a = 1;
        int n = 1;

        while (Math.abs(a) > eps) {
            a = Math.pow(-1, n - 1)/n;
            System.out.println("n = " + n + "; a = " + a);
            n++;
        }
    }
}
