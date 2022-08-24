package com.loicbaillif.s6;

public class Bird extends Animal {
    // Attributes
    boolean flying;

    public Bird(
            int age,
            String family,
            String name,
            String origin,
            boolean flying)
    {
        super(age, family, name, origin);
        this.flying = flying;
    }
}
