package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Lineal8 {

	public static void calculate() {

		double result;

		Scanner sc = new Scanner(System.in);

		// first number input
		System.out.print("Enter number 1: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter double number:");
			sc.next();
		}
		double num1 = sc.nextDouble();

		// second number input
		System.out.print("Enter number 2: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter double number:");
			sc.next();
		}
		double num2 = sc.nextDouble();

		// third number input
		System.out.print("Enter number 3: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter double number:");
			sc.next();
		}
		double num3 = sc.nextDouble();

		// calculate result
		result = (num2 + Math.sqrt(num2 * num2 + 4 * num1 * num3)) / (2 * num1) - Math.pow(num1, 3)
				+ Math.pow(num2, -2);
		System.out.println("result = " + result);
		
	}
}
