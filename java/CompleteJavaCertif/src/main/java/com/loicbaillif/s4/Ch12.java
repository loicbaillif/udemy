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

        byte hungerRating = 5; // From 1 to 10
        if (!(hungerRating > 6)) {
            System.out.println("Not hungry... yet");
        } else {
            System.out.println("I'm starving ...");
        }

        int favoriteTemp = 23; // degrees Celsius
        int currentTemp = 17;  // degrees Celsius
        String opinion;
        if (currentTemp != favoriteTemp) {
            if (currentTemp < favoriteTemp - 15) {
                opinion = "It's freezing cold ...";
            } else if (currentTemp < favoriteTemp - 10) {
                opinion = "It's kinda cold out ...";
            } else if (currentTemp < favoriteTemp - 5) {
                opinion = "It's cold but I'm ok.";
            } else if (currentTemp < favoriteTemp + 5) {
                opinion = "It's a beautiful day!";
            } else {
                opinion = "Hot weather! Hot weather!";
            }
        } else {
            opinion = "Lucky boy";
        }
        System.out.println(opinion);

        byte diceResult = 5;
        byte maxResult = 6;
        if (diceResult != maxResult) {
            System.out.println("You can do better...");
        }
    }
}
