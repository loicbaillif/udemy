package com.loicbaillif.s6;

public class Fish extends Animal {
    // Attributes
    boolean freshwater;
    boolean saltwater;


    // Constructor
    public Fish(
            int age,
            String family,
            String name,
            String origin,
            boolean freshwater,
            boolean saltwater) {
        super(age, family, name, origin);
        this.freshwater = freshwater;
        this.saltwater = saltwater;
    }


    // Methods
    public void swim() {
        System.out.printf(
                "%s swims super fast in the %s",
                this.name,
                this.freshwater? "river" : "ocean");
    }
}
