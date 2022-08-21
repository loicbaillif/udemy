package com.loicbaillif.s6;

public class Human {
    // Attributes
    int age;
    int heightInCms;
    String eyeColour;
    String firstName;
    String lastName;
    static int nbHumans = 0;

    // Constructor
    public Human(
            int age, int heightInCms,
            String eyeColour, String firstName, String lastName) {
        this.age = age;
        this.heightInCms = heightInCms;
        this.eyeColour = eyeColour;
        this.firstName = firstName;
        this.lastName = lastName;
        nbHumans++;
    }

    public Human() {
        this(99, 166, "brown", "John", "Doe");
    }

    // Methods
    public void speak() {
        System.out.printf("Hello, my name is %s %s%n", firstName, lastName);
        System.out.printf("I am %.2f meters tall.%n", (float)heightInCms/100);
        System.out.printf("I am %d years old.%n", age);
        System.out.printf("My eyes are %s.%n", eyeColour);
        System.out.printf("Oh and I am the human number %d!%n", nbHumans);
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
