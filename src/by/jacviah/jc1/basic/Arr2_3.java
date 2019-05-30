package by.jacviah.jc1.basic;

public class Arr2_3 {
	public static void calculate() {
		int[] mas = { 12, 59, -35, 24, 78, 96, 45, 0, -34, 23, 46, 62, 47, 42, 43, 13 };
		printIntArray(mas);

		int max;
		int k;
		int t;

		for (int i = 0; i < mas.length - 1; i++) {
			max = mas[i];
			k = i;
			for (int j = i; j < mas.length; j++) {
				if (mas[j] > max) {
					max = mas[j];
					k = j;
				}
			}
			t = mas[i];
			mas[i] = mas[k];
			mas[k] = t;
		}

		printIntArray(mas);
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
	}
}
