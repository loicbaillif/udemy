package com.loicbaillif.s6;

public class Parrot extends Bird implements Flyable {

    public Parrot(int age, String family, String name, String origin, boolean flying) {
        super(age, family, name, origin, flying);
    }

    @Override
    public void flyCapable() {
        System.out.println(getClass() + " can fly.");
    }
}
