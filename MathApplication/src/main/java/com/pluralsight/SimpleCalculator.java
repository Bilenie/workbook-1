package com.pluralsight;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give a number between 1-10?");
        int anyNumber = myScanner.nextInt();

        System.out.println("Give another number between 1-10?");
        int anyNumbers = myScanner.nextInt();

        int sum = anyNumber + anyNumbers;

        System.out.println("I will give you the sum of the two number");



        System.out.println("The sum of the above number is"+ " " + sum);


    }
}
