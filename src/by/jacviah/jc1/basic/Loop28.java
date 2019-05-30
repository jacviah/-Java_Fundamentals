package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputDoubleNumber;

import java.util.Scanner;

public class Loop28 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);
		double z = 0;
		String sign = "";

		while (true) {

			System.out.print("Enter sign: ");
			sign = sc.next();	
			if (sign.equals("0")) {
				break;
			}
			if (sign.equals("+") | sign.equals("-") | sign.equals("*") | sign.equals("/")) {
				System.out.print("Enter X: ");
				double x = inputDoubleNumber(sc);
				System.out.print("Enter Y: ");
				double y = inputDoubleNumber(sc);
				switch (sign) {
				case "+":
					z = x + y;
					System.out.println("z = " + z);
					break;
				case "-":
					z = x - y;
					System.out.println("z = " + z);
					break;
				case "*":
					z = x * y;
					System.out.println("z = " + z);
					break;
				case "/":
					if (y != 0) {
						z = x / y;
						System.out.println("z = " + z);
						break;
					} else {
						System.out.println("Division by zero");
					}
				}

			} else {
				System.out.println("Bad sign");
			}

		}
	}
}
