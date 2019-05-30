package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec17 {

	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter k: ");
		int k = inputIntNumber(sc);

		for (int i = 1; i <= k; i++) {
			if (isArmstrongNumber(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean isArmstrongNumber(int n) {
		int t = n;
		int sum = 0;
		int power = countNumberOfDigits(n);
		
		while (t > 0) {
			sum += Math.pow(t % 10, power);
			t /= 10;
		}

		return (n == sum) ? true : false;
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
