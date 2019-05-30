package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr34 {
	public static void calculate() {
		int n = 8;
		int m = 6;
		int min = 0;
		int max = 1;
		int count;
		int[][] a = new int[n][m];
		for (int j = 0; j < m; j++) {
			count = 0;
			for (int i = 0; i < n; i++) {
				a[i][j] = getRandomNumberInRange(min, max);
				if (a[i][j] == 1) {
					count++;
				}
				if (count == i) {
					break;
				}
			}
		}
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