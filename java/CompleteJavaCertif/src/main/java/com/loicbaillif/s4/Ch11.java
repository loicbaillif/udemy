package com.loicbaillif.s4;

import com.loicbaillif.format.Print;

public class Ch11 {
    public static void main() {
        Print.title(" Section 4 - Chapter 11: Working with Arrays ",
                (short) 80, '*');
        System.out.println("Creatign an array of int, with 100 slots");
        int[] values = new int[100];  // Integer array with 100 elements
        // Array = fixed size
        values[0] = 1000; // First element of the array, start counting at 0
        values[2] = 1000;
        values[99] = 314; // Last element of our array, size - 1

        System.out.println("Reading some of its values");
        System.out.println(values[1]); // Slots are initialized
        System.out.println(values[2]); // with default values
        System.out.println(values[3]); // which is 0 for int

        System.out.println("int array ==> Can't store another data");
        System.out.println("values[33] = \"Hello\";  // won't work");

        System.out.println("Another way to declare array:");
        String[] words = new String[] {"My", "taylor", "is", "rich"};
        System.out.println(words[3]);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("words[%d] ==> %s%n", i, words[i]);
        }
    }
}
