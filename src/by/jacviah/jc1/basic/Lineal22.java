package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Lineal22 {
    public static void calculate() {

        Scanner sc = new Scanner(System.in);

        // first number input
        System.out.print("Enter T: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid Number. Enter integer number:");
            sc.next();
        }

        int T = sc.nextInt();

        int h = T/3600;
        int min = T%3600/60;
        int sec = T%3600%60;

        System.out.println("HH: " + h + "h" +" MM: " + min + "m" + " SS: " + sec + "s");
    }
}
