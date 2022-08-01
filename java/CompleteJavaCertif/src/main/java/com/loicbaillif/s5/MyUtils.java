package com.loicbaillif.s5;

public class MyUtils {
    public static void daysToWeeks(int nbDays) {
        if (nbDays > 0) {
            int nbWeeks = nbDays / 7;
            int remainDays = nbDays % 7;
            String addendum = (remainDays == 0)
                    ? "precisely to "
                    : "to a bit more than ";
            System.out.printf("%d days correspond %s%d weeks",
                    nbDays, addendum, nbWeeks);
        } else {
            System.out.println("Negative days? I'm not there yet ...");
        }
    }
}
