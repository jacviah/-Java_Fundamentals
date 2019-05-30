package by.jacviah.jc1.basic;

public class Arr2_2 {
    public static void calculate() {
        int[] a = {2, 4, 6,13,15,19,23,24,26,34,37};
        int[] b = {1,3,4,6,7,8,18,19,26,39};
        printIntArray(a);
        printIntArray(b);
        int s = a.length+b.length;
        int[] c = new int[s];

        int i = 0;
        int k = 0;
        int l = 0;

        while (i<s) {
            if (k<a.length&l<b.length) {
                if (a[k] < b[l]) {
                    c[i] = a[k];
                    k++;
                } else {
                    c[i] = b[l];
                    l++;
                }
            } else {
                if (k==a.length&l<b.length) {
                    c[i] = b[l];
                    l++;
                }
                if (l==b.length&k<a.length) {
                    c[i] = a[k];
                    k++;
                }
            }
            i++;
        }
        printIntArray(c);
    }

    public static void printIntArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%d]", a[i]);
        }
        System.out.println();
    }
}
