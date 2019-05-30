package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputDoubleNumber;

public class Loop23 {

    public static void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = inputDoubleNumber(sc);
        System.out.print("Enter b: ");
        double b = inputDoubleNumber(sc);
        System.out.print("Enter h: ");
        double h = inputDoubleNumber(sc);
        double y = 0;
        System.out.println("+---------------+---------------+");
        for (double i = a; i <= b; i +=h) {
            y = 1/Math.tan(i/3) + 0.5*Math.sin(i);
            System.out.printf("%s %12.3f %s %+12.5f %s %n", "|", i, " | ", y, "|");
            System.out.println("+---------------+---------------+");
        }
    }
}
