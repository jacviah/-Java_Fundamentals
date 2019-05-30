package by.jacviah.jc1.basic;

public class Arr2_4 {
	public static void calculate() {
		int[] mas = { 12, 59, -35, 24, 78, 96, 45, 0, -34, 23, 46, 62, 47, 42, 43, 13 };
		printIntArray(mas);
		int t;
		for (int i=mas.length-1;i>0;i--) {
			for (int j=0;j<i;j++) {
				if (mas[j]>mas[j+1]) {
					t=mas[j];
					mas[j]=mas[j+1];
					mas[j+1]=t;
				}
			}
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
