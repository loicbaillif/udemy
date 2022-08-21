package com.loicbaillif.s5;

import java.util.Scanner;

import com.loicbaillif.format.Print;
import com.loicbaillif.s4.Ch12;

public class Ch14 {
    public static void main() {
        Print.title(" Section 4 - Chapter 14: Methods visibility ",
                (short) 80, '*');

        // void-type methods
        noReturn1();
        noReturn2(33);

        // Return-type methods
        int userInput = getUserInt();
        System.out.println(add10(userInput));

        // Call method from other package
        Ch12.main();

        // Call non-static method:
        Ch14 instance = new Ch14();
        instance.sayHello("Alpha Bravo");

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

    public static String add10(int userInput) {
        return String.format("%d + 10 = %d", userInput, userInput + 10);
    }

    public static int getUserInt() {
        System.out.println("Please enter an integer:\n");
        Scanner scanner1 = new Scanner(System.in);
        while (!scanner1.hasNextInt()) {
            System.out.println("Please enter an integer:\n");
            scanner1.next();
        }
        return scanner1.nextInt();
    }

    public void sayHello(String userName) {
        System.out.printf("Hello %s", userName);
    }
}
