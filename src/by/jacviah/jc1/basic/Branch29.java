package by.jacviah.jc1.basic;

import java.util.Scanner;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Branch29 {

    public static void calculate() {

        //input coordinates
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first point (x, y): ");
        int x1 = inputIntNumber(sc);
        int y1 = inputIntNumber(sc);

        System.out.print("Enter second point (x, y): ");
        int x2 = inputIntNumber(sc);
        int y2 = inputIntNumber(sc);

        System.out.print("Enter third point (x, y): ");
        int x3 = inputIntNumber(sc);
        int y3 = inputIntNumber(sc);

        //coefficient search
        int a = (y2 - y1) / (x2 - x1);
        int b = y1 - a * x1;

        //check poit three;
        if ((a * x3 + b) == y3){
            System.out.println("All three points lie on the same line");
        }
        else{
            System.out.println("The points do not lie on one straight line");
        }
    }
}