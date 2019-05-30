package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Loop8 {

    public static void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = inputIntNumber(sc);

        System.out.print("Enter b: ");
        int b = inputIntNumber(sc);

        System.out.print("Enter h: ");
        int h = inputIntNumber(sc);

        System.out.print("Enter c: ");
        int c = inputIntNumber(sc);

        int y = 0;

        for (int i = a; i <= b; i += h) {
            y = (i == 15) ? (i + c) * 2 : (i - c) + 6;
            System.out.println("x = "+ i + "; y = " + y);
        }
    }
}
