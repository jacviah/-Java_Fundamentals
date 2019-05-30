package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec14 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		System.out.print("Enter m: ");
		int m = inputIntNumber(sc);

		compareNumberOfDigits(n, m);
	}

	public static void compareNumberOfDigits(int n, int m) {

		if (countNumberOfDigits(n) > countNumberOfDigits(m)) {
			System.out.println("n has more digits than m");
		} else if (countNumberOfDigits(n) < countNumberOfDigits(m)) {
			System.out.println("m has more digits than n");
		} else {
			System.out.println("n has the same number of digits as m");
		}
	}

	public static int countNumberOfDigits(int a) {
		int n = 0;
		while (a > 0) {
			n++;
			a = a / 10;
		}
		return n;
	}
}
