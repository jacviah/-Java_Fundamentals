package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Lineal10 {

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


		// calculate result
		result = (Math.sin(num1)+Math.cos(num2))/(Math.cos(num1)-Math.sin(num2)*Math.tan(num1*num2));
		System.out.println("result = " + result);
		
	}
}
