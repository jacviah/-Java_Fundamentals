package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec1 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first side: ");
		int x = inputIntNumber(sc);
		System.out.print("Enter second side: ");
		int y = inputIntNumber(sc);
		System.out.print("Enter third side: ");
		int z = inputIntNumber(sc);

		if (x + y > z & x + z > y & y + z > x) {
			System.out.println("Area of triangle is " + calculateArea(x, y, z) + ".");
		} else {
			System.out.println("Not a Triangle.");
		}

	}

	public static double calculateArea(int a, int b, int c) {

		double p = 0.5 * (a + b + c);
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return S;

	}
}
