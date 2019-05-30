package by.jacviah.jc1.basic;

import java.util.Scanner;
import static by.jacviah.jc1.basic.Input.inputDoubleNumber;
import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Lineal37 {

	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		// Proposition 1
		System.out.print("Enter N: ");
		int N = inputIntNumber(sc);
		Boolean flagNEven = ((N % 2 == 0) & (N > 9) & (N < 100)) ? true : false;
		System.out.println("N is even 2-digit number: " + flagNEven);

		// Proposition 2
		int _4digitNumber = -1;
		while (_4digitNumber < 1000 | _4digitNumber > 9999) {
			System.out.println("Enter 4-digit integer number:");
			_4digitNumber = inputIntNumber(sc);
		}
		Boolean flag4digitNumber = (_4digitNumber % 10 + _4digitNumber / 10 % 10 == _4digitNumber / 100 % 10
				+ _4digitNumber / 1000 % 10) ? true : false;
		System.out.println("the sum of the first two numbers equal the sum of the last two numbers: " + flag4digitNumber);

		// Proposition 3
		int _3digitNumber = -1;
		System.out.print("Enter 3-digit integer number: ");
		while (_3digitNumber < 100 | _3digitNumber > 999) {
			System.out.println("Enter 3-digit integer number:");
			_3digitNumber = inputIntNumber(sc);
		}
		Boolean flag3digitNumber = (((_3digitNumber % 10 + _3digitNumber / 10 % 10 + _3digitNumber / 100 % 10)
				% 2 == 0)) ? true : false;
		System.out.println("sum of digits is even number: " + flag3digitNumber);
	
		// Proposition 3
		System.out.print("Enter X coordinate: ");
		double x = inputDoubleNumber(sc);
		System.out.print("Enter Y coordinate: ");
		double y = inputDoubleNumber(sc);
		System.out.print("Enter m: ");
		double m = inputDoubleNumber(sc);
		System.out.print("Enter n: ");
		double n = inputDoubleNumber(sc);
		
		boolean flagMNPlane = false;
		boolean Mmax = (m >= n) ? true:false;
		
		if (Mmax & (x <= m) & (x >= n)) { 
			flagMNPlane = true;
		}
		
		if (!Mmax & (x >= m) & (x <= n)) { 
			flagMNPlane = true;
		}		
		
		System.out.println(" point (" + x + " ; " + y + ")  lies on a plane: " + flagMNPlane);		
		
		
	}
}
