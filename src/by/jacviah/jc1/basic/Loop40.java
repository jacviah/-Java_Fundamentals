package by.jacviah.jc1.basic;

import static by.jacviah.jc1.basic.Input.inputIntNumber;

import java.util.Scanner;

public class Loop40 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = inputIntNumber(sc);
		int t;
		boolean flag;

		for (int i = 1; i <= n; i++) {
			t = i;
			flag = true;
			while (t>0&flag) {
				if ((t%10==0) || (i%(t%10))!=0) {
					flag = false;
				}
				t=t/10;
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}
