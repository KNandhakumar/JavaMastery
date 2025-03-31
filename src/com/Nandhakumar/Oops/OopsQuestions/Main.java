package com.Nandhakumar.Oops.OopsQuestions;

abstract class Vehicle{
    final void engineStart(){
        System.out.println("engine started");
    }
    static String getVehicleType(){
        return "petrol type";
    }

    abstract void drive();
}

class Car extends Vehicle{
    void drive(){
        System.out.println("drive a car");
    }
}

class Bike extends Vehicle{
    void drive(){
        System.out.println("drive a bike");
    }
}

public class Main {
    public static void main(String[] args) {
        // creating object for Car
        Car Aadi = new Car();
        Aadi.drive();
        // static method can be access using object instead of class
        System.out.println("Vehicle type : " + Vehicle.getVehicleType());
    }
}
