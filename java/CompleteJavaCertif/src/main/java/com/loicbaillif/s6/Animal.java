package com.loicbaillif.s6;

import java.util.Objects;

public class Animal {
    // Attributes
    int age;
    String family;
    String name;
    String origin;

    // Constructor
    public Animal(int age, String family, String name, String origin) {
        this.age = age;
        this.family = family;
        this.name = name;
        this.origin = origin;
        System.out.printf("%s joined our zoo!%n", name);
    }

    // Methods
    public void angry() {
        System.out.printf("%s is angry and becomes loud.%n", name);
    }

    public void compareOrigin(Animal animal2) {
        if (Objects.equals(this.origin, animal2.origin)) {
            System.out.printf("%ss and %ss come from the same region!%n",
                    this.name, animal2.name);
            System.out.println("Maybe they already knew each other...");
        } else {
            System.out.printf("%ss and %ss don't live in the same region%n",
                    this.name, animal2.name);
            System.out.println("Before being here they never imagined " +
                    "each other existence!");
        }
    }

    public void eat(String food) {
        System.out.printf("Vets are feeding %s with %s%n", this.name, food);
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
