package by.jacviah.jc1.basic;

import java.util.Random;

public class ArrArr11 {
	public static void calculate() {
		Random random = new Random();
		int m = 5;
		int n = 7;
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = random.nextInt(20) + 1;
			}
		}
		printIntArray(a);
		System.out.println("------------------------------");
		for (int i = 0; i < m; i++) {
			if ((i+1)%2!=0) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
			}
			if ((i+1)%2==0) {
			for (int j = n-1; j >= 0; j--) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
			}
		}
		
		

	}

	public static void printIntArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}
}