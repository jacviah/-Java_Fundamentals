package by.jacviah.jc1.basic;

public class Arr2_7 {
	public static void calculate() {
		int[] a = { 2, 8, 11, 13, 15, 19, 23, 24, 26, 34, 37,87};
		int[] b = { 1, 3, 4, 6, 7, 8, 18, 19, 39, 42 };
		printIntArray(a);
		printIntArray(b);
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			while (j < b.length && a[i] > b[j]) {
				System.out.println("b" + j + " before " + "a" + i);
				j++;
			}
			if (j < b.length && i == a.length - 1) {
				System.out.println("b" + j + " and further after a" + i);
			}
		}
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]", a[i]);
		}
		System.out.println();
	}
}
