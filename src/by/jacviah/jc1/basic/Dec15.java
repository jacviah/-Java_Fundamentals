package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec15 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter K: ");
		int k = inputIntNumber(sc);
		System.out.print("Enter N: ");
		int n = inputIntNumber(sc);

		int number = 0;
		int count = 0;

		while (number <= n) {
			if (sumDigits(number) == k) {
				count++;
			}
			number++;
		}

		int[] arr = new int[count];
		number = 0;
		count = 0;

		while (number <= n) {
			if (sumDigits(number) == k) {
				arr[count] = number;
				count++;
			}
			number++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("a[" + i + "] = " + arr[i]);
		}
	}

	public static int sumDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
