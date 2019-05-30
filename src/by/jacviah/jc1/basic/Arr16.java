package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Random;
import java.util.Scanner;

public class Arr16 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		Random random = new Random();

		int[] array = new int[2 * n];

		for (int i = 0; i < 2 * n; i++) {
			array[i] = random.nextInt(100);
		}
		printIntArray(array);

		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = array[i] + array[2*n - 1 - i];
		}
		printIntArray(temp);
		System.out.println("maximum element is " + findMax(temp));
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]", a[i]);
		}
		System.out.println();
	}

	public static int findMax(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}
