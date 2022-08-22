package com.loicbaillif.s6;

import com.loicbaillif.format.Print;

public class Ch18 {
    public static void main() {
        Print.title(
                " Section 6 - Chapter 18: Java Stack + Heap ",
                (short) 80);

        int age;
        age = 12;
        System.out.println("Variable 'age' created. Local variable.");
        doWork();

        Print.title(" End of chapter 18 ", (short) 80, '*');
    }

    public static void doWork() {
        System.out.println("I am working.");
        float weight = 75.4f;
        System.out.println("weight = " + weight);
    }
}
