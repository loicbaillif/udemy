package com.loicbaillif.s6;

public class Bird extends Animal {
    // Attributes
    boolean flying;

    // Constructor
    public Bird(
            int age,
            String family,
            String name,
            String origin,
            boolean flying) {
        super(age, family, name, origin);
        this.flying = flying;
    }

    // Methods
    public void fly() {
        if (flying) {
            System.out.println("I believe I can fly!");
        } else {
            System.out.println("Boohoohoo nooo I can't");
        }
    }
}
