package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Loop27 {
	public static void calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter m: ");
		int m = inputIntNumber(sc);
		System.out.print("Enter n: ");
		int n = inputIntNumber(sc);
		int flag;
		for (int i = m; i <= n; i++) {
			flag = 0;
			System.out.printf("divisors of number %2d: ", i);
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag += 1;		
					if (flag !=1) {
						System.out.print(",");					
					}
					System.out.printf("%3d", j);
				}
				if (j == i-1) {
					if (flag !=0) {
						System.out.print(";");		
					}
					System.out.println();
				}
			}
		}
	}
}
