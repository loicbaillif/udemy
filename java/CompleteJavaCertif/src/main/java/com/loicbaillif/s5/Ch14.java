package com.loicbaillif.s5;

import com.loicbaillif.format.Print;

public class Ch14 {
    public static void main() {
        Print.title(" Section 4 - Chapter 14: Methods visibility ",
                (short) 80, '*');

        noReturn1();
        noReturn2(33);

        Print.title(" End of Chapter 14 ", (short) 80, '*');
    }

    public static void noReturn1() {
        System.out.println("This method does not return anything, even though " +
                "it can print something.");
    }

    public static void noReturn2(int age) {
        System.out.println("I don't need to return anything to wish you " +
                "a happy " + age + " birthday!");
    }
}
