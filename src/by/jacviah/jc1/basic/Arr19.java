package by.jacviah.jc1.basic;

public class Arr19 {
	public static void calculate() {
		int[] mas = { 12, 59, -35, 24, 78, 96, 45, 0, -34, 23, 46, 62, 47, 42, 43, 13 };
		printIntArray(mas);
		int k;
		for (int i=0;i<mas.length-1; i++) {
			for (int j=i+1;j<mas.length; j++) {
				if (mas[i]>mas[j]) {
					k = mas[j];
					mas[j] = mas[i];
					mas[i] = k;
				}
			}
		}
		printIntArray(mas);
		
		int i = 1;
		int j;
		int mx = 0;
		int mn = 1;
		
		while (i<mas.length) {
			if (mas[i] == mas[i-1]) {
				j=i;
				k=1;
				while ((mas[j]==mas[j-1])&(j<=mas.length)) {
					j+=1;
					k+=1;
				}
				if (k>mx) {
					mx=k;
					mn=j-1;
				}
				i=i+k;
			} else i=i+=1;
		}
		if (mx == 0) {
			System.out.println("All numbers occur 1 time. Mininmum number is " + mas[0]);
		} else {
			System.out.println(" Mininmum number is " + mas[mn] + " (from most frequently occurring numbers).");			
		}
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
	}

	public static void printIntArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i][0]);
		}
		System.out.println();

		for (int j = 0; j < a.length; j++) {
			System.out.printf("%4d", a[j][1]);
		}
		System.out.println();

	}
}
