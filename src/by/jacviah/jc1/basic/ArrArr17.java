package by.jacviah.jc1.basic;

public class ArrArr17 {
	public static void calculate() {
		int n=6;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0 | j==0 | i==n-1 | j==n-1) {
					a[i][j] = 1; 
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