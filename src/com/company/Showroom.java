package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {
    //Array list: Alternative to arrays. makes it easier to work with arrays.
    private ArrayList<Car> cars = new ArrayList<Car>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    //Add cars to the showroom
    //View all cars in the showroom
    //View A single car in the showroom
    //Remove car

    //Adding a car to the showroom
    public void addCar() {
        //Declare and initialize a new car
        System.out.println("Add a new car");
        Car car = new Car();

        //Set the properties of the car
        System.out.println("Please input the car name: ");
        car.name = scanner.nextLine();

        System.out.println("Please input the car manufacturer: ");
        car.manufacturer = scanner.nextLine();

        System.out.println("Please input the car type: ");
        car.type = scanner.nextLine();

        System.out.println("Please input the car id: ");
        car.setId(intScanner.nextInt());

        //Arraylist.add is used to add items to the arraylist.
        this.cars.add(car);
        System.out.println(car.name + " Added Successfully");
    }

    void viewAllCars() {
        System.out.println("All Available cars: \n");

        for (Car car: cars) {
            System.out.println("name: " + car.name + " type: " + car.type);
        }
    }

    void viewCar () {

        //Try catch: Helps handle exception[errors] in code
        try {
            //arraylist.get: used to get the item by the index.
            System.out.println("Please input the index of the car you want to view: ");
            int carIndex = intScanner.nextInt();

            Car car = this.cars.get(carIndex);
            System.out.println("Name: " + car.name + " Type: " + car.type);
        } catch (Exception ex) {
            System.out.println("Unable to find car. please try again!!");
        }
    }

    void removeCar() {
        try {
            System.out.println("Please input the index of the car to remove");
            int carIndex = intScanner.nextInt();
            cars.remove(carIndex);

            System.out.println("Removed successfully");
        } catch (Exception ex) {
            System.out.println("Unable to remove specified car");
        }
    }

}
