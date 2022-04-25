package com.company;

public class Car {
    public String type;
    public String manufacturer;
    public String name;
    private int id;

    void getName() {
        System.out.println("Get name in the car class");
    }

    void makeSound() {

    }

    void setId(int id) {
        this.id = id;
    }
}
