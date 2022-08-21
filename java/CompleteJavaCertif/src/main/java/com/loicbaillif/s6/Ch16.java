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

        Print.title(" End of chapter 15 ", (short) 80, '*');
    }
}
