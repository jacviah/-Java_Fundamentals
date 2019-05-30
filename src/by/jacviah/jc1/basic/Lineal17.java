package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Lineal17 {
	public static void calculate() {

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

		// calculate arithmetic mean
		System.out.println("arithmetic mean of cubes of numbers is  is " + 0.5 * (Math.pow(num1, 3) + Math.pow(num2, 3)));
		
		//calculate geometric mean
		System.out.println("geometric mean of modules of numbers is " + Math.sqrt((Math.abs(num1) * Math.abs(num2))));
		
	}
}
