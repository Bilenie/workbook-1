package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

//print the first question for the users.
        askUser(myScanner);
    }

    public static void askUser(Scanner myScanner) {
        System.out.println("What is your name?");
//get the name from the users and store it in variable name.
        String name = myScanner.nextLine();
//print a message for the users.
        System.out.println("What a beautiful name!!!");
//print the second question for the users.
        System.out.println("What is your hours worked this week?");

//get the hour worked and store it in hourlyWorked.
        float hourlyWorked = myScanner.nextFloat();

//print the second question for the users.
        System.out.println("What is your pay rate?");

//get the amount paid from the users and store it in payRate.
        float payRate = myScanner.nextFloat();

        float totalGrossPay = grossPay(hourlyWorked, payRate);

        if (hourlyWorked > 40) {
            double overTimeHour = hourlyWorked - 40;
            double overTime = overTimeHour * (payRate * 1.5);
            System.out.println("your over time is " + overTimeHour + " " + "your over time pay is $" + " " + overTime);
        } else {
            System.out.println("No over time");
        }


        System.out.println("The gross pay for" + " " + name + "," + " " + "is" + " " + "$" + totalGrossPay);
        System.out.printf("The gross pay for %s, is $%.2f", name, totalGrossPay);
    }

    public static float grossPay(float var1, float var2) {

        return var1 * var2;
    }

}




