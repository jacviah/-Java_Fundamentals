package by.jacviah.jc1.basic;

public class ArrArr21 {
	public static void calculate() {
		int n = 20;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					a[i][j] = n - i + j;
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
}