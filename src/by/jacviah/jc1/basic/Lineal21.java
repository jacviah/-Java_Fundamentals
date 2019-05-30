package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Lineal21 {
    public static void calculate() {

        Scanner sc = new Scanner(System.in);

        // first number input
        System.out.print("Enter number in format nnn.ddd: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid Number. Enter double number:");
            sc.next();
        }

        double initNumber = sc.nextDouble();

        int intPart = (int) initNumber;
        int decPart = (int)(initNumber * 1000) % 1000;

        double reverseNumber = decPart + intPart * 0.001;

        System.out.println("Double Number: " + initNumber);
        System.out.println("Integer Part: " + intPart);
        System.out.println("Decimal Part: " + decPart);
        System.out.println("ReverseNumber: " + reverseNumber);
    }
}
