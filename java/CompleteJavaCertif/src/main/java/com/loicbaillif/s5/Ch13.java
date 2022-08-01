package com.loicbaillif.s5;

import com.loicbaillif.format.Print;

public class Ch13 {
    public static void main() {
        Print.title(" Section 4 - Chapter 13: Methods in Java ",
                (short) 80, '*');
        System.out.println("Invoking method println() to display this text");
        printSomething("hammer");
    }

    public static void printSomething(String argument) {
        System.out.println("Hi Universe!");
        System.out.println("You asked for " + argument + "?");
    }
}
