package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec2 {
	
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int x = inputIntNumber(sc);
		System.out.print("Enter second number: ");
		int y = inputIntNumber(sc);


		if (x > 0 & y > 0) {
			System.out.println("Greatest common divisor is " + gcd(x, y) + ".");
			System.out.println("Least common multiple is " + lcm(x, y) + ".");
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
