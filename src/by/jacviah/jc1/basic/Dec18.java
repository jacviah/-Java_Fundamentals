package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec18 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		findIncreasingSequences(n);
	}

	public static void findIncreasingSequences(int n) {

		int c3;

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
				if (c3 % 10 <= (c3 / 10) % 10) {
					f = false;
				}
				c3 = c3 / 10;
			} while (c3 >= 10);
			if (f) {
				System.out.println(i + "");
			}
		}
	}

}
