package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec6 {

	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter side: ");
		int x = inputIntNumber(sc);
		System.out.println("Area of hexagon is " + 6*calculateArea(x, x, x) + ".");
		
	}
	
	
	public static double calculateArea(int a, int b, int c) {

		double p = 0.5 * (a + b + c);
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return S;

	}
}
