package by.jacviah.jc1.basic;

public class ArrArr20 {
	public static void calculate() {
		int n=8;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j>i&j<n-i-1)|(j<i&j>n-i-1)) {
					a[i][j] = 0; 
				} else {
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