package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Prompt user to choose what size sandwich they would like to have.
        System.out.println(" What size would you like 1 or 2 ? \n- 1: Regular: base price $5.45\n" +
                "- 2: Large: base price $8.95");

        //take the user input for the size and store it in a variable called sandwichSizeChoice.
        int sandwichSizeChoice = myScanner.nextInt();

        //Prompt user for their age
        System.out.println(" How old are you?\nStudent (17 years old or younger) — receive a 10% discount\n" +
                "Seniors (65 years old or older) — receive a 20% discount");

        //initialize age to 0 to take what ever the user provides.
        int age = 0;

        //take the user input for the age and store it in a variable called age.
        age = myScanner.nextInt();

        //After we have both data we do something to the input we recieved from the users.

        //First let us do task based on the size of the sandwich

        //store the price of the sandwich size in a variables.
        double price = 0;

        if (sandwichSizeChoice == 1) {
            price = 5.45;
            System.out.printf("You choose Regular.\nThe price is $%.2f", price);
        }
        else if (sandwichSizeChoice == 2) {
            price = 8.95;
            System.out.printf("You choose Large. The price is $%.2f", price);
        } else {
            System.out.println("Please choose a size!!!");
        }

        //Second let us do task based on the age of the users compute the discount.

        double discount = 0;

        if (age <= 17 && sandwichSizeChoice == 1) {
            discount = 0.1;
            System.out.println("\nCongratulation you got a discount.");
        }
        if (age >= 65 && sandwichSizeChoice == 1) {
            discount = 0.2;
            System.out.println("\nCongratulation you got a discount.");
        }
        if (age <= 17 && sandwichSizeChoice == 2) {
            discount = 0.1;
            System.out.println("\nCongratulation you got a discount.");
        }
        if (age >= 65 && sandwichSizeChoice == 2) {
            discount = 0.2;
            System.out.println("\nCongratulation you got a discount.");
        }

        // Call totalPrice method and store the result
        double finalPrice = totalPrice(price, discount);

        //print out the age,discount, and total price.

        System.out.printf("Your age is %d %n", age);
        System.out.printf("Your discount is: %.0f%%%n", discount * 100); // Convert to %
        System.out.printf("The total cost is $%.2f", finalPrice);


    }

    public static double totalPrice(double price, double discount) {

        return price - (price * discount);

    }
}
