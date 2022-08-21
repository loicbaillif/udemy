package com.loicbaillif.s6;

import com.loicbaillif.format.Print;

public class Ch16 {
    public static void main() {
        Print.title(" Section 6 - Chapter 16: Program Flow ", (short) 80);

        Human hume2 = new Human();
        hume2.age = 54;
        // hume2.heightInCms = 172;
        hume2.eyeColour = "black";
        hume2.firstName = "Boris";
        hume2.lastName = "Black";
        hume2.speak();

        Human hume3 = new Human();
        hume3.speak();

        System.out.println("*** Exercise: Animal class");
        Animal ostrich = new Animal(17, "birds", "ostrich", "Africa");
        Animal elephant = new Animal(42, "mammals", "elephant", "Africa");
        Animal cobra = new Animal(3, "reptiles", "cobra", "America");

        ostrich.angry();
        elephant.eat("Apples");
        cobra.compareOrigin(ostrich);
        elephant.compareOrigin(ostrich);

        Print.title(" End of chapter 15 ", (short) 80, '*');
    }
}
