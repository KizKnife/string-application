package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String item = "apple";
        double itemPrice = 2.30;
        int quantity = 3;

        System.out.printf("You bought %d %ss for $%.2f", quantity, item, itemPrice * quantity);
    }
}
