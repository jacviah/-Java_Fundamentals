package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec9 {
	public static void calculate() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = inputIntNumber(sc);
		System.out.print("Enter b: ");
		int b = inputIntNumber(sc);
		System.out.print("Enter c: ");
		int c = inputIntNumber(sc);
		
		if (gcd(gcd(a,b),c) == 1) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");			
		}

	}

	public static int gcd(int a, int b) {
		while (a != 0 & b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return (a + b);
	}
}
