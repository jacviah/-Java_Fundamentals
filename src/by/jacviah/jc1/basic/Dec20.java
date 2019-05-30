package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec20 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		int s = findStepToNil(n);

		System.out.println("n = " + n + ", s = " + s);
	}

	public static int findStepToNil(int n) {
		
		if (n<10) {
			return 1;
		} else {		
			return 1 + findStepToNil(n - sumDigit(n));
		}
	}

	public static int sumDigit(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
