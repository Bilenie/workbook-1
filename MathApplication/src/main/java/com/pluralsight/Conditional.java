package com.pluralsight;

public class Conditional {

    public static void main(String[] args) {
        int age = 18 ;
        String name = "eric";
        // this is a conditional if statement.
        if (age>=18 && name.equals("eric")) {
            // this is the code that runs if the condition is true
            System.out.println("congratulation your an adult and your name is eric.!");
        } else if (age < 18 && name.equals("bob")) {
            System.out.println("Whats up young bob");
        }
        else if(name.equals("bob") || name.equals("eric") ){
            System.out.println(" You see me");
        }
        // this is the code that runs if the condition is false.
        else{
            System.out.println("You got some grown up to do");
        }

        if(name.equals("bob")){
            System.out.println(" This is also a true condition");
        }
    }
}
