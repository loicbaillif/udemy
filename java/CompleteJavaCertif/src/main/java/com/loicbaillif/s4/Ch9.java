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

        // Combining declaration & assignment
        int y = 33;
        String sentence = "I am another String.";
        System.out.println(y);
        System.out.println(sentence);

        // First operators:
        System.out.println(y + x);
        System.out.println(y - x);
        System.out.println(words + sentence);
    }
}
