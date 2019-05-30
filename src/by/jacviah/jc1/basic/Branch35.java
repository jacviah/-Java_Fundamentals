package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Branch35 {

    public static void calculate() {

        //input day number
        int d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first point (x, y): ");
        while ((d <= 1) & (d >= 365)) {
            d = inputIntNumber(sc);
            sc.next();
        }

        while (d > 0) {
            if (d <= 31 & d > 0) {
                System.out.print(d + ", January");
                break;
            }
        }
    }
}
