package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec16 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		
		int[][]	arr = findTwins(n);
		printTwins(arr);
	
	}
	
	public static int[][] findTwins(int n) {
		
		int[][] twins = new int[n-1][2];
		int t = n;
		
		for (int i=0;i<n-1;i++) {
			twins[i][0]=t;
			twins[i][1]=t+2;
			t++;
		}
		return twins;
	}
	
	public static void printTwins(int[][] a) {
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Pair twins " + (i+1) + ": " + a[i][0] + " and "+ a[i][1]);
		}
	}
}
