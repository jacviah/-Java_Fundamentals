package by.jacviah.jc1.basic;

import java.util.Scanner;
import static by.jacviah.jc1.basic.Input.inputIntNumber;

public class Loop38 {
	public static void calculate() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = inputIntNumber(sc);
		int t = n/10;
		boolean flag = true;
		int step = n%10-t%10;
		
		while (t>0) {
			flag = (n%10-t%10 == step) ? true:false;
			if (!flag) {
				System.out.println("not a arithmetic progression");
				break;
			} 
			n=n/10;
			t=t/10;
		}
		if (flag) {
			System.out.println("There is an arithmetic progression");		
		}
		
	}
}
