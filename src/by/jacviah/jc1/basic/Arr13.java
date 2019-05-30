package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Arr13 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter L: ");
		int l = inputIntNumber(sc);
		System.out.print("Enter N: ");
		int n = inputIntNumber(sc);
		System.out.print("Enter M: ");
		int m = inputIntNumber(sc);

		int count = 0;

		if (l < n) {
			for (int i = l; i <= n; i++) {
				if (i % m == 0) {
					count++;
				}
			}
		} else {
			System.out.println("Wrong L or N");
		}
		System.out.println("the number of members of the sequence of natural numbers between " + l + " and " + n
				+ " that are multiples of " + m + " is " + count);

	}
}
