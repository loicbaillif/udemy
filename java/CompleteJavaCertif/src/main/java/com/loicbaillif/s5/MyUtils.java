package com.loicbaillif.s5;

public class MyUtils {
    public static void daysToWeeks(int nbDays) {
        if (nbDays > 0) {
            int nbWeeks = nbDays / 7;
            int remainDays = nbDays % 7;
            String addendum = (remainDays == 0)
                    ? "precisely to "
                    : "to a bit more than ";
            System.out.printf("%d days correspond %s%d weeks%n",
                    nbDays, addendum, nbWeeks);
        } else {
            System.out.println("Negative days? I'm not there yet ...");
        }
    }

    public static void sumOfTwo(int a, int b) {
        System.out.printf("%d + %d = %d%n", a, b, a + b);
    }


    public static int add10(int a) {
        int result = a + 10;
        return result;
    }
}
