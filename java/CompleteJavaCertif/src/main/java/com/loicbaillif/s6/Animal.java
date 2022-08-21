package com.loicbaillif.s6;

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
        System.out.printf("%s joined our zoo!");
    }
}
