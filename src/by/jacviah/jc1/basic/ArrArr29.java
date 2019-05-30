package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr29 {
	public static void calculate() {
		int n = 10;
		int min = -20;
		int max = 20;
		
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					a[i][j] = getRandomNumberInRange(min, max);
				}
			}
		printIntArray(a);
		for (int i = 0; i < n; i++) {
			if (a[i][i]>0) {
				System.out.println("a["+i+"]["+i+"] = " + a[i][i]);
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