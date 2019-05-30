package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec19 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		int s = findSumOddDigitNumber(n);
		int c = findCountEvenDigitNumber(s);
		System.out.println("s = " + s + ", c = " + c);
	}

	public static int findSumOddDigitNumber(int n) {

		int c3;
		int sum = 0;
		boolean f;

		int c1 = 1;
		for (int i = 1; i < n; i++) {
			c1 = c1 * 10;
		}
		int c2 = c1 * 10 - 1;
		for (int i = c1; i <= c2; i++) {
			c3 = i;
			f = true;
			do {
				if ((c3 % 10) % 2 == 0) {
					f = false;
				}
				c3 = c3 / 10;
			} while (c3 > 0);
			if (f) {
				sum += i;
			}
		}
		return sum;
	}

	public static int findCountEvenDigitNumber(int n) {

		int c3;
		int count = 0;
		boolean f;

		int c1 = 1;
		for (int i = 1; i < n; i++) {
			c1 = c1 * 10;
		}
		int c2 = c1 * 10 - 1;
		for (int i = c1; i <= c2; i++) {
			c3 = i;
			f = true;
			do {
				if ((c3 % 10) % 2 != 0) {
					f = false;
				}
				c3 = c3 / 10;
			} while (c3 > 0);
			if (f) {
				count++;
			}
		}
		return count;
	}
}
