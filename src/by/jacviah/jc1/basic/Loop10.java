package by.jacviah.jc1.basic;

public class Loop10 {
    public static void calculate() {

        long product = 1;

        for (int i = 1; i <= 200; i++) {
            product = i*i*i*i;
            System.out.println("i = " + i + "; product = " + product);
        }
    }
}
