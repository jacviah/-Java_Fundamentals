package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec13 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		int[] arr = nToArray(n);
		for (int i = 0; i<arr.length;i++) {
			System.out.println("a["+i+"] = " + arr[i]);
		}
	}
	public static int[] nToArray(int a) {
		int n = 0;
		int b = a;
		while (b>0) {
			n++;
			b=b/10;
		}
		int[] res = new int[n];
		for (int i=n-1; i>=0;i--) {
			res[i] = a%10;
			a=a/10;
		}
		return res;
	}
	
}
