package by.jacviah.jc1.basic;

public class ArrArr19 {
	public static void calculate() {
		int n=20;
		int[][] a = new int[n][n];
		for (int i = 0; i < n/2; i++) {
			for (int j = i; j < n - i; j++) {
					a[i][j] = 1; 
				}
			}
		
		for (int i = n-1; i >= n/2; i--) {
			for (int j = i; j >= n - i - 1; j--) {
					a[i][j] = 1; 
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