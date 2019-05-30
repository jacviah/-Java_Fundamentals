package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Loop29 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int x = inputIntNumber(sc);
		System.out.print("Enter second number: ");
		int y = inputIntNumber(sc);
		
		int z = y;
		int buf1 = 0;
		int buf2 = 0;
		
		while (x > 0) {
			buf1 = x % 10;
			while (z > 0) {
				buf2 = z % 10;
				if (buf1 == buf2) {
					System.out.println(buf1 + " ");
				}
				z = z / 10;
			}
			x=x/10;
			z = y;
		}

	}
}