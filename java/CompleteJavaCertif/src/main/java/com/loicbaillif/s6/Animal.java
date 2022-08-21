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
        System.out.printf("%s joined our zoo!", name);
    }

    // Methods
    public void angry() {
        System.out.printf("%s is angry and becomes loud", name);
    }

    public void compareOrigin(Animal animal2) {
        if (Objects.equals(this.origin, animal2.origin)) {
            System.out.println("They come from the same region!");
            System.out.println("Maybe they already knew each other");
        } else {
            System.out.println("They don't live in the same region");
            System.out.println("Before being here they never imagined " +
                    "each other existence!");
        }
    }

    public void eat(String food) {
        System.out.printf("Vets are feeding %s with %s", this.name, food);
    }
}
