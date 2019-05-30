package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Loop12 {

    public static void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = inputIntNumber(sc);

        int a = 1;

        for (int i = 1; i <= n; i++) {
            a = a + 6;
            System.out.println("a["+ i + "] = " + a);
        }
    }
}
