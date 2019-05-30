package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr30 {
	public static void calculate() {
		int n = 10;
		int m = 20;
		int min = 0;
		int max = 15;
		int count;
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = getRandomNumberInRange(min, max);
			}
		}
		printIntArray(a);
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 5) {
				}
				if (count>2) {
					System.out.println(i);
					break;
				}
			}
		}
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