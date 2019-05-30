package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr39 {
	public static void calculate() {
		int n = 4;
		int m = 5;
		int k = 8;
		int min = 0;
		int max = 20;

		int[][] a = new int[m][n];
		int[][] b = new int[n][k];
		int[][] c = new int[m][k];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = getRandomNumberInRange(min, max);
			}
		}
		printIntArray(a);
		System.out.println("----------------------------------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				b[i][j] = getRandomNumberInRange(min, max);
			}
		}
		printIntArray(b);
		System.out.println("----------------------------------------");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				for (int l = 0; l < n; l++) {
					c[i][j] += a[i][l] * b[l][j];
				}
			}
		}
		printIntArray(c);
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