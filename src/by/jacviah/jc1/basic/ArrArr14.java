package by.jacviah.jc1.basic;

public class ArrArr14 {
	public static void calculate() {
		int n=6;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==n-j-1) {
					a[i][j] = i+1; 
				} else {
					a[i][j] = 0;
				}
			}
		}
		printIntArray(a);
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
