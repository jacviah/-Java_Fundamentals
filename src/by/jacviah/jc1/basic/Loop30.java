package by.jacviah.jc1.basic;

import java.util.*;

public class Loop30 {
	
	public static void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numeral: ");
		String numeral = sc.next();	
		int res = 0;

		for (int i = 0; i < numeral.length(); i++) {
			// Getting value of symbol s[i]
			int s1 = value(numeral.charAt(i));

			// Getting value of symbol s[i+1]
			if (i + 1 < numeral.length()) {
				int s2 = value(numeral.charAt(i + 1));

				// Comparing both values
				if (s1 >= s2) {
					// Value of current symbol is greater
					// or equal to the next symbol
					res = res + s1;
				} else {
					// Value of current symbol is
					// less than the next symbol
					res = res + s2 - s1;
					i++; 
				}
			} else {
				res = res + s1;
				i++;
			}
		}

		System.out.println(res);
	}

	
	static int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}	
}
