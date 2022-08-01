package com.loicbaillif.s5;

import com.loicbaillif.format.Print;

public class Ch13 {
    public static void main() {
        Print.title(" Section 4 - Chapter 13: Methods in Java ",
                (short) 80, '*');
        System.out.println("Invoking method println() to display this text");
        printSomething("hammer");
        printSomething(44);
        MyUtils.daysToWeeks(44);
        MyUtils.daysToWeeks(56);
    }

    public static void printSomething(String argument) {
        System.out.println("Hi Universe!");
        System.out.println("You asked for " + argument + "?");
    }

    public static void printSomething(int argument) {
        System.out.println("Hi Universe!");
        System.out.printf("You need %d dollars, right?\n", argument);
    }
}
