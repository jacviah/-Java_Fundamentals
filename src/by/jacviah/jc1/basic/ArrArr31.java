package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr31 {
	public static void calculate() {
		int n = 10;
		int m = 6;
		int min = 0;
		int max = 999;
		int count  = 0;
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = getRandomNumberInRange(min, max);
			}
		}
		printIntArray(a);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] > 9 & a[i][j]<100) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void printIntArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}