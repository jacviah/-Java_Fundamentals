package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Branch28 {

    public static void calculate() {

        //input numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = inputIntNumber(sc);

        System.out.print("Enter b: ");
        int b = inputIntNumber(sc);

        System.out.print("Enter c: ");
        int c = inputIntNumber(sc);

        System.out.print("Enter d: ");
        int d = inputIntNumber(sc);


        // comparing numbers for equality
        boolean flag = false;

        if (a == d) {
            flag = true;
            System.out.println("a = d");
        }

        if (b == d) {
            flag = true;
            System.out.println("b = d");
        }

        if (c == d) {
            flag = true;
            System.out.println("c = d");
        }

        // maximum search (if d!=a, d!=b, d!=c)
        if (!flag) {
            int max = (a - d) >= (b - d) ? a - d : b - d;
            max = (max >= c - d) ? max : c - d;
            System.out.println("max: " + max);
        }
    }
}