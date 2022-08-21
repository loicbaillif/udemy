package com.loicbaillif.s6;

public class Human {
    // Attributes
    int age;
    static int nbHumans;
    int heightInCms;
    String eyeColour;
    String firstName;
    String lastName;

    // Methods
    public void speak() {
        System.out.printf("Hello, my name is %s %s", firstName, lastName);
        System.out.printf("I am %.2f meters tall.", heightInCms / 100);
        System.out.printf("I am %d years old.", age);
        System.out.printf("My eyes are %s", eyeColour);
        System.out.printf("Oh and I am the human number %d", nbHumans);
    }

    public void eat() {
        System.out.println("I am eating ...");
    }

    public void walk() {
        System.out.println("I am walking");
    }

    public void work() {
        System.out.println("I am working");
    }
}
