package by.jacviah.jc1.basic;

public class Loop39 {
	public static void calculate() {
		int t;
		for (int i = 100; i < 1000; i++) {
			t = i % 100;
			if (t * 7 == i) {
				System.out.println(i);
			}
		}
	}
}
