package com.loicbaillif;

import com.loicbaillif.format.Print;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Print.title(" Section 1 ", (short) 40, '*', ' ');
        Print.title(" Section 1 ", (short) 41, '*', ' ');
        Print.title(" Section 1 ", (short) 40, '*', '-');
        Print.title(" Séction 1 ", (short) 40, '*', ' ');
    }
}