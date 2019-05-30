package by.jacviah.jc1.basic;

public class Arr2_8 {
	public static void calculate() {
	int[][] a = {{1, 4}, {2, 3}, {4, 7}, {3, 5}};
	
	printIntArray(a);
	
	int m=1;
	for (int i=0; i<a.length; i++) {
		m = lcm(m, a[i][1]);
	}
	
	for (int i=0; i<a.length; i++) {
		a[i][0]*=m/a[i][1];
		a[i][1]*=m/a[i][1];
	}
	printIntArray(a);	
	
	a = sort(a);
	printIntArray(a);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
	public static int[][] sort (int[][] arr) {
		int[] t;
		int i = 0;
		while (i < arr.length-2) {

			if (arr[i][0] <= arr[i + 1][0]) {
				i++;
			}

			if (arr[i][0] > arr[i + 1][0]) {
				t = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = t;
				if (i>0) {
					i--;
				}
			}
		}
		return arr;
	}
	

	public static void printIntArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%8d", a[i][0]);
		}
		System.out.println();

		for (int j = 0; j < a.length; j++) {
			System.out.printf("%8d", a[j][1]);
		}
		System.out.println();

	}
}
