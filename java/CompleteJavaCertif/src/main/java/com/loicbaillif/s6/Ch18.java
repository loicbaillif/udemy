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

        System.out.println("*** Heap");
        Animal pet1 = new Animal(11, "Fishes", "goldfish", "Asia");
        // pet1 stored in stack will point to Animal() memory address in heap.
        System.out.println(pet1);
        pet1 = new Animal(22, "Mammals", "wolf", "Europe");
        // pet1 re-assigned: it points toward a new Animal() memory address in heap;
        // former pet1 (goldfish) is still in heap, but cannot be accessed anymore.
        // Garbage collector will take care of eliminating it.

        Animal pet2 = new Animal(5, "Birds", "eagle", "America");

        Print.title(" End of chapter 18 ", (short) 80, '*');
    }

    public static void doWork() {
        System.out.println("I am working.");
        float weight = 75.4f;
        System.out.println("weight = " + weight);
    }
}
