package by.jacviah.jc1.basic;

import java.util.Scanner;

public class Loop32 {
	public static void calculate() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = sc.next();
		boolean flag;
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			flag = false;
			if ((i == 0) & ((s.charAt(i) == '_') | (Character.isLetter(s.charAt(i))))) {
				flag = true;
			}
			if ((i != 0) & ((s.charAt(i) == '_') | (Character.isLetterOrDigit(s.charAt(i))))) {
				flag = true;
			}			
			if (flag !=true) {
				count+=1;
				System.out.println("Wrong character on position " + i);				
			}
		}
		if (count == 0) {
			System.out.println("String has no illegal characters");			
		} else {
			System.out.println("String contains illegal characters");				
		}
	}
}
