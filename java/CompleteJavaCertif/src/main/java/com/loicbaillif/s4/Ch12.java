package com.loicbaillif.s4;

import com.loicbaillif.format.Print;

public class Ch12 {
    public static void main() {
        Print.title(" Section 4 - Chapter 12: Control Flow (if, else, switch) ",
                (short) 80, '*');

        boolean hungry = true;
        if (hungry) {
            // Executed when hungry == true;
            System.out.println("I'm starving...");
        } else {
            // Executed when hungry == false;
            System.out.println("I'm not hungry.");
        }
        if (!hungry) {
            System.out.println("You can have a nap then.");
        }
    }
}
