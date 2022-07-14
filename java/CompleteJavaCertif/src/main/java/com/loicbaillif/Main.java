package com.loicbaillif;

import com.loicbaillif.format.Print;
import com.loicbaillif.s4.Ch9;

public class Main {
    public static void main(String[] args) {
        Print.title("", (short) 80);
        Print.title(" UDEMY - The Complete Java Certification Course ",
                (short) 80);
        Print.title("", (short) 80);
        Ch9.main();
    }
}