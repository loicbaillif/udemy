package com.loicbaillif.s6;

import com.loicbaillif.format.Print;

public class Ch22 {
    public static void main() {
        Print.title(" Section 6 - Chapter 22: Abstract Classes ", (short) 80);

        Rose rose1 = new Rose();
        rose1.describeFlowers();

        Poppy poppy1 = new Poppy();
        poppy1.describeFlowers();

        Print.title(" End of chapter 22 ", (short) 80, '*');
    }
}
