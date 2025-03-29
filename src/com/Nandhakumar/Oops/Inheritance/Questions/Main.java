package com.Nandhakumar.Oops.Inheritance.Questions;

// super class
class Vehicle{
    String brand;
    int year;
    void startEngine(){
        System.out.println();
    }
}

// sub class car
class Car extends Vehicle{
    String fuelType;
    void startEngine(){
        System.out.println("car engine starts");
    }
    void drive(){
        System.out.println("car is driving");
    }
}

// sub class for truck
class Truck extends Vehicle{
    int loadCapacity;
    void startEngine() {
        System.out.println("car engine starts");
    }
    void haul(){
        System.out.println("truck is hauling");
    }
}

public class Main {
    public static void main(String[] args) {
        Car Aadi = new Car();
        Aadi.brand = "Aadi A6";
        Aadi.fuelType = "Petrol";
        System.out.println("Car Brand :" + " " + Aadi.brand + " " + "Fuel type :" + " " + Aadi.fuelType);
        Aadi.startEngine();
    }
}
