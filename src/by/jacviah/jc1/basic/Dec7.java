package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec7 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = inputIntNumber(sc);
		int[][] c = new int[n][2];
		int[][] result;
		
		for (int i=0;i<n;i++) {
			System.out.println("Point " + i + ". Enter x:");
			c[i][0] = inputIntNumber(sc);		
			System.out.println("Point " + i + ". Enter y:");
			c[i][1] = inputIntNumber(sc);		
		}
		
		result = find2PointsWithMaxDistance(c);
		System.out.println("Max distance between:");
		System.out.println("Point 1: x = " + result[0][0] + ", y =" + result[0][1] + "Point 2: x = " + result[1][0] + ", y =" + result[1][1]);	
		
	}
	
	public static int[][] find2PointsWithMaxDistance(int[][] a) {
		int al = a.length;
		double max = 0;
		int[][] b = new int[2][2];
		for (int i = 0;i<al;i++) {
			for (int j=0;j<al;j++) {
				double t = calculateDistance(a[i][0],a[i][1],a[j][0],a[j][1]);
				if (max<t) {
					b[0][0] = a[i][0];
					b[0][1] = a[i][1];
					b[1][0] = a[j][0];
					b[1][1] = a[j][1];					
				}
			}
		}
		
		return b;		
	}	
	
	
	public static double calculateDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1-x2)*(x1*x2)+(y1-y2)*(y1-y2));		
	}
}
