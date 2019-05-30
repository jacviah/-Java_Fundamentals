package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Lineal13 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		// coordinates input
		System.out.print("Enter first point X coordinate: ");
		double x1 = inputNumber(sc);
		System.out.print("Enter first point Y coordinate: ");
		double y1 = inputNumber(sc);
		System.out.print("Enter second point X coordinate: ");
		double x2 = inputNumber(sc);
		System.out.print("Enter second point Y coordinate: ");
		double y2 = inputNumber(sc);
		System.out.print("Enter third point X coordinate: ");
		double x3 = inputNumber(sc);
		System.out.print("Enter third point Y coordinate: ");
		double y3 = inputNumber(sc);

		// calculate sides
		double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double side2 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));		
		double side3 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

		// calculate perimeter 
        double p = side1 + side2 + side3;
        
		// calculate semi-perimeter 
        double semi_p = p / 2;      
      
		// calculate area 
        double S = Math.sqrt(semi_p * (semi_p - side1) * (semi_p - side2) * (semi_p-side3));  
		System.out.println("p = " + p);
		System.out.println("S = " + S);	

	}
	
	static double inputNumber(Scanner sc) {
	while (!sc.hasNextDouble()) {
		System.out.println("Invalid Number. Enter double number:");
		sc.next();
	}
	return sc.nextDouble();
	}
}
