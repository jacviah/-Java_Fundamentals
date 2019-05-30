package by.jacviah.jc1.basic;

public class Dec8 {
	public static void calculate() {
		int[] mas = { 1, 5, 7, 13, 45, 6, 9, 7, 23, 41, 67, 8, 56, 43, 42, 41, 21, 123 };

		System.out.println("Second largest number is " + getSecondLargestNumber(mas));
	}

	public static int getSecondLargestNumber(int[] a) {
		int max = Integer.MIN_VALUE;
		int sln = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				sln = max;
				max = a[i];
			}

			if (a[i] > sln & a[i] < max) {
				sln = a[i];
			}
		}
		return sln;
	}
}
