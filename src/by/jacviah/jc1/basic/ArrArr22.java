package by.jacviah.jc1.basic;

public class ArrArr22 {
	public static void calculate() {
		int n = 20;
		int t;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			t = 0;
			for (int j = 0; j < n - i; j++) {
					t++;
					a[i][j] = i+t ;
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