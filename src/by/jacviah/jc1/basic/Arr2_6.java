package by.jacviah.jc1.basic;

public class Arr2_6 {
	public static void calculate() {
		int[] arr = { 12, 59, -35, 24, 78, 96, 45, 0, -34, 23, 46, 62, 47, 42, 43, 13 };

		printIntArray(arr);
		arr = sort(arr);
		printIntArray(arr);
	}

	public static int[] sort (int[] arr) {
		int t;
		int i = 0;
		while (i < arr.length-2) {

			if (arr[i] <= arr[i + 1]) {
				i++;
			}

			if (arr[i] > arr[i + 1]) {
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
	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
	}
}
