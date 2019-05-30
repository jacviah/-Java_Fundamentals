package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Lineal16 {

	public static void calculate() {

		double result;
		int n = -1;
		Scanner sc = new Scanner(System.in);
	
		// number input
		while ( n<1000 | n>9999) {
			System.out.println("Enter integer number >= 1000:");
			n = inputNumber (sc);
		} 
		
		result = (n % 10) * (n /10 % 10) * (n /100 % 10) * (n /1000 % 10);
		System.out.println("result = " + result);
		
	}
	
	static int inputNumber(Scanner sc) {
	while (!sc.hasNextInt()) {
		System.out.println("Invalid Number.");
		sc.next();
	}
	return sc.nextInt();
	}
}
