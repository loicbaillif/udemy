package com.loicbaillif.s4;

import com.loicbaillif.format.Print;

public class Ch9 {
    public static void main() {
        Print.title(" Section 4 - Chapter 9 : Variables and Data Types ",
                (short) 80, '*', ' ');
        // Variable assignment, Integers
        int x;
        x = 4;
        System.out.println(x);
        x = 23;
        System.out.println(x);

        // Other variables types
        // x = "This is an error"; this can't work
        String words;
        words = "I am a String.";
        System.out.println(words);
    }
}
