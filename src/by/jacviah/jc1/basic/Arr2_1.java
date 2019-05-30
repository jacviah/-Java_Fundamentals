package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Random;
import java.util.Scanner;

public class Arr2_1 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		System.out.print("Enter m: ");
		int m = inputIntNumber(sc);
		System.out.print("Enter k: ");
		int k = inputIntNumber(sc);
		
		int l=n+m;
		
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[l];
		
		for (int i=0; i<n;i++) {
			a[i] = random.nextInt(100);		
		}
		for (int i=0; i<m;i++) {
			b[i] = random.nextInt(100);		
		}
		printIntArray(a);
		printIntArray(b);
		for (int i=0; i<l;i++) {
			if (i<=k) {
				c[i]=a[i];
			}
			if ((i>k)&(i<=k+m)) {
				c[i]=b[i-k-1];
			}
			if ((i>k+m)) {
				c[i]=a[i-m];
			}
		}
		printIntArray(c);
	}
	
	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]", a[i]);
		}
		System.out.println();
	}
}
