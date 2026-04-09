package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        // REPEAT FOR NEXT EXERCISE

        // Step 1
        String favoriteColor = "red";
        System.out.println("My favorite color is " + favoriteColor);
        short classYear = 2026;
        System.out.println("My classYear is " + classYear);
        char initialMiddle = 'T';
        System.out.println("My middle initial is " + initialMiddle);
        String havePets = "no";
        System.out.println("Do I have pets: " + havePets);
        String niceMessage = "pretty niceeee";
        System.out.println("This is " + niceMessage);

        System.out.println();

        // Step 2
        int numberOfDaysInAWeek = 7;
        double priceOfCoffee = 4.90;
        char favoriteLetter = 'K';
        boolean isRaining = false;

        System.out.println("There are " + numberOfDaysInAWeek + " days in a week");
        System.out.printf("The price of a coffee is: $%.2f%n", priceOfCoffee);
        System.out.println("My favorite letter is: " + favoriteLetter);
        System.out.println("Is raining? " + isRaining);
    }
}
