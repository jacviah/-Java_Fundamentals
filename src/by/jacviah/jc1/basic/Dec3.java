package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec3 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = inputIntNumber(sc);
		System.out.print("Enter second number: ");
		int b = inputIntNumber(sc);
		System.out.print("Enter third number: ");
		int c = inputIntNumber(sc);
		System.out.print("Enter fourth number: ");
		int d = inputIntNumber(sc);


		if (a > 0 & b > 0 & c > 0 & d > 0) {
			System.out.println("Greatest common divisor is " + gcd(gcd(a, b),gcd(c, d)) + ".");
		} else {
			System.out.println("Not a natural number.");
		}

	}
	
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
