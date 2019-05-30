package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr36 {
	public static void calculate() {
		int n = 10;
		int min = -20;
		int max = 20;
		
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					a[i][j] = getRandomNumberInRange(min, max);
				}
			}
		printIntArray(a);
		
		b[0][0] = (a[1][0] + a[1][1] + a[0][1])/3;
		b[n-1][n-1] = (a[n-2][n-2] + a[n-1][n-2] + a[n-2][n-1])/3;
		b[0][n-1] = (a[0][n-2] + a[1][n-2] + a[0][n-1])/3;
		b[n-1][0] = (a[n-2][0] + a[n-2][1] + a[n-1][1])/3;
		
		for (int i=1; i<n-2;i++) {
			b[i][0] = (a[i][1]+a[i-1][0]+a[i-1][1]+a[i+1][1]+a[i+1][0])/5;
			b[n-1-i][0] = (a[n-1-i][n-2]+a[n-i][n-1]+a[n-2-i][n-1]+a[n-i][n-2]+a[n-2-i][n-2])/5;
		}		
		
		for (int j=1; j<n-2;j++) {
			b[0][j] = (a[1][j]+a[0][j-1]+a[1][j-1]+a[1][j+1]+a[0][j+1])/5;
			b[0][n-1-j] = (a[n-2][n-1-j]+a[n-1][n-j]+a[n-1][n-2-j]+a[n-2][n-j]+a[n-2][n-2-j])/5;
		}	
		
		for (int i=1; i<n-1;i++) {
			for (int j=1;j<n-1;j++) {
				b[i][j] = (a[i-1][j-1]+a[i-1][j]+a[i-1][j+1]+a[i][j-1]+a[i][j+1]+a[i+1][j-1]+a[i+1][j]+a[i+1][j+1])/8;
			}
		}
		System.out.println("----------------------------------------");
		printIntArray(b);		
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