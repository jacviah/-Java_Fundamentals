package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Random;
import java.util.Scanner;

public class Arr17 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		Random random = new Random();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(100);
		}

		printIntArray(array);

		int k = findMin(array);
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (array[i] == k) {
				count++;
			}
		}

		int[] newArray = new int[n - count];

		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k) {
				count++;
			} else {
				newArray[i - count] = array[i];
			}
		}

		printIntArray(newArray);
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]", a[i]);
		}
		System.out.println();
	}

	public static int findMin(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

}
