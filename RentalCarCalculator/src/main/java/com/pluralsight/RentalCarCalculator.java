package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;


public class RentalCarCalculator {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ask user for a date and store it as a string
        System.out.println( "What is the pickup date? ");

        String dateRented = myScanner.nextLine();

        //ask the user the number of days for the rental
        System.out.println( "The number of days you renting for? ");

        //store that as a int
        int numOfDays = myScanner.nextInt();

        myScanner.nextLine();

        //ask optional yes or no question to the users??

        //do you want an electronic toll tag 3.95 up-charger per day
        System.out.println( "Do you want toll tag? toll tag 3.95 up-charger/day.(y/n)");
        //store answer as a string
        String tollTag = myScanner.nextLine().toLowerCase();

        //do you want a gps? 2.95 per day
        System.out.println( "Do you want gps? 2.95 up-charger/day.(y/n)");
        //store answer as a string
        String gpsChoice = myScanner.nextLine().toLowerCase();

        //do you want a roadside assistance? 3.95 per day
        System.out.println( "Do you want a roadside assistance? 3.95 upcharger/day.(y/n)");
        //store answer as a string
        String roadSideAssi= myScanner.nextLine().toLowerCase();

        //we need to ask their age
        System.out.println( "How old are you? ");
        //store that as an int
        int age = myScanner.nextInt();
        //basic car rental price
        double basicPrice = 29.99;

        //options cost
        double optionCost = 0;
        if (tollTag.equalsIgnoreCase("y")) {
            optionCost += 3.95;
        }
        if (gpsChoice.equalsIgnoreCase("y")) {
            optionCost += 2.95;
        }
        if (roadSideAssi.equalsIgnoreCase("y")) {
            optionCost += 3.95;
        }
        //Generate total option cost with the date
        optionCost *= numOfDays;

        //underage driver surcharge
        double surCharge = 0;
        if(age<25){
            surCharge = basicPrice * 0.3;
        }
        //total cost
       double totalCost = (basicPrice*numOfDays) + optionCost + surCharge ;

        System.out.printf( "The regular price per day is: $%.2f %n",basicPrice);
        System.out.printf( "The optional cost per day is: $%.2f %n",optionCost);
        System.out.printf( "The surcharge price per day is: $%.2f %n",surCharge);
        System.out.printf( "So your total cost is: $%.2f",totalCost);

    }

// Create separate methods for each task if needed — one for optional costs, one for surcharge, and one for calculating total cost — so we can call them from the main method instead of putting everything inside main.

}
