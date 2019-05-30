package by.jacviah.jc1.basic;

public class Dec10 {
	public static void calculate() {
		for (int i=1; i<10; i++) {
			if (i%2!=0) {
				System.out.println("n = " + i + ", factorial = " + calculateFactorial(i));
			}
		}
	}
	
	public static int calculateFactorial(int n) {
		int fact = 1;
		for (int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}

}
