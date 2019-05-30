package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Branch31 {
    public static void calculate() {

        //input brick sizes
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first brick side: ");
        int x = inputIntNumber(sc);

        System.out.print("Enter second brick side: ");
        int y = inputIntNumber(sc);

        System.out.print("Enter third brick side: ");
        int z = inputIntNumber(sc);

        //input hole width
        System.out.print("Enter hole width: ");
        int A = inputIntNumber(sc);

        //input hole height
        System.out.print("Enter hole height: ");
        int B = inputIntNumber(sc);

        boolean flag = false;
        flag = (A <= x & (B <= y || B <= z)) ? true : false;
        flag = (A <= y & (B <= x || B <= z)) ? true : false;
        flag = (A <= z & (B <= x || B <= y)) ? true : false;

        if (flag) {
            System.out.println("Brick can go through the hole.");
        }
        else{
            System.out.println("Brick can't go through the hole.");
        }
    }
}
