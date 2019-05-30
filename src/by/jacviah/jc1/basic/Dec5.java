package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec5 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = inputIntNumber(sc);
		System.out.print("Enter second number: ");
		int b = inputIntNumber(sc);
		System.out.print("Enter third number: ");
		int c = inputIntNumber(sc);

		if (a > 0 & b > 0 & c > 0) {
			System.out.println(max(a, b, c) + min(a, b, c));
		} else {
			System.out.println("Not a natural number.");
		}

	}

	public static int max(int a, int b, int c) {
		int max;
		if (a<b) {
			max = b;
		} else {
			max = a;
		}
		
		if (c>max) {
			max = c;
		}
		
		return max;
	}

	public static int min(int a, int b, int c) {
		int min;
		if (a<b) {
			min = a;
		} else {
			min = b;
		}
		
		if (c<min) {
			min = c;
		}
		
		return min;
	}
}
