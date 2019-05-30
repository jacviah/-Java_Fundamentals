package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr37 {
	public static void calculate() {
		int n = 10;
		int min = -20;
		int max = 20;
		int k;
		int[][] a = new int[n][n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = getRandomNumberInRange(min, max);
			}
		}
		printIntArray(a);
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			k = getRandomNumberInRange(0, n - 1);
			if (i != k) {
				b = a[i];
				a[i] = a[k];
				a[k] = b;
			} else {
				i--;
			}
		}
		System.out.println("----------------------------------------");
		printIntArray(a);
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