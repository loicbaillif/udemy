package com.loicbaillif.s6;

public class Chicken extends Bird {

    public Chicken(int age, String family, String name, String origin, boolean flying) {
        super(age, family, name, origin, flying);
    }

    @Override
    public void fly() {
        System.out.println("Believe it or not, but some of them can fly.");
    }
}
