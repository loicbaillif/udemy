package com.loicbaillif.s6;

import com.loicbaillif.format.Print;

public class Ch21 {
    public static void main() {
        Print.title(" Section 6 - Chapter 21: Interfaces ", (short) 80);

        Chicken chicken1 = new Chicken(2, "Hen", "Cocot", "Europe", true);
        chicken1.fly();
        Parrot parrot1 = new Parrot(
                7, "Psittacopasserae", "Kwak", "America", true);
        parrot1.flyCapable();

        Print.title(" End of chapter 21 ", (short) 80, '*');
    }
}
