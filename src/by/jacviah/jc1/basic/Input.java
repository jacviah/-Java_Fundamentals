package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Input {
	
	static int inputIntNumber(Scanner s) {
		while (!s.hasNextInt()) {
			System.out.println("Invalid Number. Enter integer number:");
			s.next();
		}
		return s.nextInt();
	}

	static double inputDoubleNumber(Scanner s) {
		while (!s.hasNextDouble()) {
			System.out.println("Invalid Number. Enter double number:");
			s.next();
		}
		return s.nextDouble();
	}

}
