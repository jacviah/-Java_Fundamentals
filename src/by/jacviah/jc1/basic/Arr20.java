package by.jacviah.jc1.basic;

public class Arr20 {
	public static void calculate() {
		int[] mas = { 12, 59, -35, 24, 78, 96, 45, 0, -34, 23, 46, 62, 47, 42, 43, 13 };
		System.out.println("1");
		printIntArray(mas);

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				mas[i] = 0;
			}
		}
		System.out.println("2");
		printIntArray(mas);
		int k;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				k = i;
				while (mas[k] == 0 & k < mas.length - 1) {
					k++;
				}
				mas[i] = mas[k];
				mas[k] = 0;
			}
		}

		System.out.println("3");
		printIntArray(mas);
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
	}
}