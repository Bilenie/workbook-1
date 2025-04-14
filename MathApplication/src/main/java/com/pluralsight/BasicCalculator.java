package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("Enter the first number:");
        float anyNumber = myScanner.nextFloat();

        System.out.println("Enter the second number:");
        float anyNumbers = myScanner.nextFloat();

        myScanner.nextLine();

        System.out.println("Do you want to add, subtract , multiply or divide the two numbers?");
        String choice = myScanner.nextLine();

        System.out.println("Great!!!");

        float sum = multiplyNumber (anyNumber, anyNumbers);

        System.out.println("The sum of the above numbers is"+ " " + sum);

    }

      public static float multiplyNumber(float var1, float var2){

          return var1* var2;
    }

}
