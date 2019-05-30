package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Dec12 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter X: ");
		int x = inputIntNumber(sc);
		System.out.print("Enter Y: ");
		int y = inputIntNumber(sc);
		System.out.print("Enter Z: ");
		int z = inputIntNumber(sc);
		System.out.print("Enter Z: ");
		int t = inputIntNumber(sc);

		System.out.println("Area is " + calculateArea(x, y, z, t));
	}

	public static double calculateArea(int x, int y, int z, int t) {
		
		double d = Math.sqrt(x*x+y*y);
		double area = 0.5*x*y+calculateTriangleArea(d,z,t);
		return area;
		
	}
	
	public static double calculateTriangleArea(double a, double b, double c) {

		double p = 0.5 * (a + b + c);
		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return S;

	}
}
