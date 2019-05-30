package by.jacviah.jc1.basic;

public class Loop37 {
	public static void calculate() {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if (((i * 100 + j) % 99 == 0)&((j * 100 + i) % 49 == 0)) {
					System.out.println(i + " and " + j);
				}
			}
		}
	}
}
