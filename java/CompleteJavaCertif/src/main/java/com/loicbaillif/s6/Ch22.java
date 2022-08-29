package com.loicbaillif.s6;

import com.loicbaillif.format.Print;

public class Ch22 {
    public static void main() {
        Print.title(" Section 6 - Chapter 22: Abstract Classes ", (short) 80);

        Rose rose1 = new Rose();
        rose1.describeFlowers();

        Poppy poppy1 = new Poppy();
        poppy1.describeFlowers();

        Plantae rose2 = new Rose();
        Plantae poppy2 = new Poppy();
        askPlantaeDescription(rose2);
        askPlantaeDescription(rose1);
        askPlantaeDescription(poppy2);

        Print.title(" End of chapter 22 ", (short) 80, '*');
    }

    public static void askPlantaeDescription(Plantae plantae) {
        System.out.print("Here is the description about " + plantae + "\n\t");
        plantae.describeFlowers();
    }
}
