package com.loicbaillif.s6;

import com.loicbaillif.format.Print;

public class Ch15 {
    public static void main() {
        Print.title(" Section 6 - Chapter 15: Class & Object ", (short) 80);

        Human hume1 = new Human();
        hume1.age = 25;
        hume1.heightInCms = 182;
        hume1.eyeColour = "green";
        hume1.firstName = "Andy";
        hume1.lastName = "Alpha";
        hume1.speak();

        Print.title(" End of chapter 15 ", (short) 80, '*');
    }
}
