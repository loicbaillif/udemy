package com.loicbaillif.s6;

import com.loicbaillif.format.Print;

public class Ch19 {
    public static void main() {
        Print.title(" Section 6 - Chapter 19: Inheritance ", (short) 80);

        Bird bird1 = new Bird(3, "parrot", "cacatoes", "America", true);
        bird1.fly();
        bird1.eat("seeds");
        bird1.sleep();

        Fish fish1 = new Fish(
                11, "sharks", "white shark", "Africa", false, true);
        fish1.swim();
        fish1.eat("tuna");
        fish1.sleep();

        Print.title(" End of chapter 19 ", (short) 80, '*');
    }
}
