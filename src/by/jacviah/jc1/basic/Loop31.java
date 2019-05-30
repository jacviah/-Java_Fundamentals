package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Random;
import java.util.Scanner;

public class Loop31 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String s;
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;	

		while (true) {

			x1 = random.nextInt(15) + 1;
			x2 = random.nextInt(15) + 1;
			x3 = random.nextInt(15) + 1;
			x4 = random.nextInt(15) + 1;
			x5 = random.nextInt(15) + 1;
			
			System.out.println("Guess five numbers between 1 and 15.");
			System.out.println("Numbers can repeat.");
			System.out.println("Ready to go? Enter Y to start, something else to exit:");
			s = sc.next();
			if (s.equals("Y")) {
				System.out.print("Take a guess first number: ");
				int y1 = inputIntNumber(sc);
				System.out.print("Take a guess second number: ");
				int y2 = inputIntNumber(sc);
				System.out.print("Take a guess third number: ");
				int y3 = inputIntNumber(sc);
				System.out.print("Take a guess fourth number: ");
				int y4 = inputIntNumber(sc);
				System.out.print("Take a guess fifth number: ");
				int y5 = inputIntNumber(sc);
				checkNumber(y1, x1, x2, x3, x4, x5);
				checkNumber(y2, x1, x2, x3, x4, x5);
				checkNumber(y3, x1, x2, x3, x4, x5);
				checkNumber(y4, x1, x2, x3, x4, x5);
				checkNumber(y5, x1, x2, x3, x4, x5);
				System.out.println("I maid numbers: " + x1 + ", " + x2 + ", " + x3 + ", " + x4 + ", " + x5);
			} else
				break;
		}
	}

	public static void checkNumber(int a, int x1, int x2, int x3, int x4, int x5) {
		if ((a == x1) | (a == x2) | (a == x3) | (a == x4) | (a == x5)) {
			System.out.println("You guessed my number - " + a);
		} else {
			System.out.println("Your guess " + a + " is wrong.");
		}
	}
}
