package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the car showroom");
        Showroom myShowroom = new Showroom();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        do {
            System.out.println("Please choose an activity: ");
            System.out.println("""
                    1. Add Car
                    2. View All Cars
                    3. View Single Car
                    4. Remove Car
                    """);

            userInput = scanner.nextLine();

            switch(userInput) {
                case "quit":
                    System.out.println("Exiting Application!!");
                    break;
                case "1":
                    myShowroom.addCar();
                    break;
                case "2":
                    myShowroom.viewAllCars();
                    break;
                case "3":
                    myShowroom.viewCar();
                    break;
                case "4":
                    myShowroom.removeCar();
            }
        } while (!userInput.equalsIgnoreCase("quit"));

        Audi audi = new Audi();
        audi.getName();

        System.out.println(audi);
    }
}
