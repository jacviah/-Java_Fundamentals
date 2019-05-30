package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec11 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);

		int[] mas = { 1, 5, 7, 13, 45, 6, 9, 7, 23, 41, 67, 8, 56, 43, 42, 41, 21, 123 };
		int[] res = {};

		System.out.println(sumThreeConsecutiveElements(mas, n));

		System.out.print("Enter k: ");
		int k = inputIntNumber(sc);
		System.out.print("Enter m: ");
		int m = inputIntNumber(sc);

		res = sumThreeConsecutiveElements2(mas, k, m);
		for (int i=0; i<res.length;i++) {
			System.out.println("i = "+ i + ", sum = " + res[i]);			
		}
	}

	public static int sumThreeConsecutiveElements(int[] a, int k) {
		int sum = 0;
		if (k >= 0 & k < a.length - 2) {
			sum = a[k] + a[k + 1] + a[k + 2];
		} else {
			System.out.println("Wrong k");
		}
		return sum;
	}

	public static int[] sumThreeConsecutiveElements2(int[] a, int k, int m) {
		int[] sum = {};
		if (k >= 0 & k < m & m < a.length - 2) {
			int n = m - k + 1;
			sum = new int[n];
			for (int i = k; i <= m; i++)
				sum[i - k] = a[i] + a[i + 1] + a[i + 2];
		} else {
			System.out.println("Wrong date");
		}
		return sum;
	}
}
