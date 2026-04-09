package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String item = "apple";
        double itemPrice = 2.37;
        int quantity = 3;

        System.out.println("You bought " + quantity + " " + item + "s for $" + (float) (itemPrice * quantity));
    }
}
