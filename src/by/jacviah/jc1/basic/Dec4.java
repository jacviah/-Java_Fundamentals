package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec4 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = inputIntNumber(sc);
		System.out.print("Enter second number: ");
		int b = inputIntNumber(sc);
		System.out.print("Enter third number: ");
		int c = inputIntNumber(sc);

		if (a > 0 & b > 0 & c > 0) {
			System.out.println("Least common multiple is " + lcm(lcm(a, b),c) + ".");
		} else {
			System.out.println("Not a natural number.");
		}

	}
	
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	public static int lcm(int a, int b) {
		return a*b/gcd(a, b);
	}
}

