package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("What is your name?");

        String name = myScanner.nextLine();

        System.out.println("What a beautiful name!!!");

        System.out.println("What is your hours worked this week?");

        myScanner.nextFloat();

        float hourlyWorked = myScanner.nextFloat();
        myScanner.nextLine();

        System.out.println("What is your pay rate?");
        myScanner.nextLine();

        float payRate = myScanner.nextFloat();

        float sum = grossPay(hourlyWorked, payRate);

        System.out.println("The sum of the above numbers is"+ " " + name + sum);

    }

    public static float grossPay(float var1, float var2){

        return var1 * var2;
    }

}





