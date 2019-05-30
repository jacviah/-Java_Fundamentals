package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Arr18 {

	public static void calculate() {
		int[] mas = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n1: ");
		int n1 = inputIntNumber(sc);
		System.out.print("Enter a1: ");
		int a1 = inputIntNumber(sc);
		System.out.print("Enter n2: ");
		int n2 = inputIntNumber(sc);
		System.out.print("Enter a2: ");
		int a2 = inputIntNumber(sc);

		mas = insertDice(mas, n1, a1);
		mas = insertDice(mas, n2, a2);
		for (int i = 0; i < 3; i++) {
			if (mas[i] == 0) {
				mas = insertDice(mas, i + 1, 10 - (a1 + a2));
			}
		}
		printIntArray(mas);

	}

	public static int[] insertDice(int[] arr, int n, int a) {
		if (n == 1 | n == 4 | n == 7 | n == 10) {
			for (int i = 0; i < 10; i += 3) {
				arr[i] = a;
			}
		}
		if (n == 2 | n == 5 | n == 8) {
			for (int i = 1; i < 10; i += 3) {
				arr[i] = a;
			}
		}
		if (n == 3 | n == 6 | n == 9) {
			for (int i = 2; i < 10; i += 3) {
				arr[i] = a;
			}
		}

		return arr;
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]", a[i]);
		}
		System.out.println();
	}
}
