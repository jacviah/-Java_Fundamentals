package by.jacviah.jc1.basic;

public class Loop36 {
	public static void calculate() {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if ((i * 100 + j) % (i * j) == 0) {
					System.out.println(i + " and " + j);
				}
			}
		}
	}
}
