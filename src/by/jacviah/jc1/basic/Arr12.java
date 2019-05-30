package by.jacviah.jc1.basic;

public class Arr12 {
	public static void calculate() {
		int[] mas = { 12, 56, 34, 21, 78, 96, 45, 0, 34, 23, 47, 62, 41, 42, 43, 59 };
		int sum = 0;
		
		for (int i = 1; i < mas.length; i++) {
			if (isPrime(i)) {
				sum+=mas[i];
			}
		}
		System.out.println("Sum of numbers in prime indexes is " + sum);
	}
	
	public static boolean isPrime(int n) {
		if (n == 1)
			return false;	
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
