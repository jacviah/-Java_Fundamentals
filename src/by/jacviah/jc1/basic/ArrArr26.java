package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class ArrArr26 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		System.out.print("Enter m: ");
		int m = inputIntNumber(sc);
		int maxEl = Integer.MIN_VALUE;
		int iMax = 0;
		int jMax = 0;
		int iMin = 0;
		int jMin = 0;
		int minEl = Integer.MAX_VALUE;

		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Enter a["+i+"]["+j+"]");
				a[i][j] = inputIntNumber(sc);
				if (a[i][j] < minEl) {
					minEl = a[i][j];
					iMin = i;
					jMin = j;

				}
				if (a[i][j] > maxEl) {
					maxEl = a[i][j];
					iMax = i;
					jMax = j;
				}
			}
		}
		printIntArray(a);
		
		int k;
		int[][] neg = new int[n][2];
		int[][] max = new int[n][2];
		for (int i = 0; i < n; i++) {
			k=Integer.MIN_VALUE;
			for (int j = 0; j < m; j++) {
				if (a[i][j]<0) {
					neg[i][1]+=a[i][j];
					neg[i][0]=i;					
				}
				if (a[i][j]>k) {
					k=a[i][j];
				}
				if (j==m-1) {
					System.out.println("line " + i + ": max element is " + k);
				}
			}
		}
		printIntArray(neg);

		int t = a[iMax][jMax];
		a[iMax][jMax] = a[iMin][jMin];
		a[iMin][jMin] = t;
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
}