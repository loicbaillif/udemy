package com.loicbaillif.s4;

import com.loicbaillif.format.Print;

public class Ch10 {
    public static void main() {
        Print.title(" Section 4 - Chapter 10: More on data types ",
                (short) 80, '*');
        System.out.println("int range: Integer coded on 4 bytes.");
        System.out.println("byte range: Integer coded on 1 byte.");
        System.out.println("\tbyte min = -128\n\tbyte max = 127");
        System.out.println("short range: Integer coded on 2 bytes");
        System.out.println("\tshort min = -32768\n\tshort max = 32767");
        System.out.println("long range: Integer coded on 8 bytes");
        long bigNumber = 100000000000L;
        System.out.println("long bigNumber = 10000000000L");
    }
}
