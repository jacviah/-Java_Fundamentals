package by.jacviah.jc1.basic;

public class Arr9 {
	public static void calculate() {
		int[] mas = { 12, 56, 34, 21, 78, 96, 45, 0, 34, 23, 47, 62, 41, 42, 43, 59 };
		int max = mas[0];
		int min = mas[0];
		int iMax = 0;
		int iMin = 0;

		printIntArray(mas);
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				iMax = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				iMin = i;
			}
		}

		int k = mas[iMin];
		mas[iMin] = mas[iMax];
		mas[iMax] = k;
		printIntArray(mas);		
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]",a[i]);
		}
		System.out.println();	
	}
}
