package com.Nandhakumar.Oops.ThisKeyword.Exercises;

class Car{
    String brand;
    String model;
    double price;

    // default constructor
    Car(){
        this.brand = "unknown";
        this.model = "unknown";
        this.price = 0.0;
    }

    // constructor overloading
    Car(String brand){
        // calling default constructor
        this();
        this.brand = brand;
    }

    // constructor overloading
    Car(String brand, String model, double price){
        this(brand);
        this.model = model;
        this.price = price;
    }

    // creating method to display the values
    void display(){
        System.out.println("Brand : " + brand + " , Model : " + model + " , Price : " + price);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        // creating object for class
        Car car1 = new Car();
        Car car2 = new Car("Aadi");
        Car car3 = new Car("Rollce royce","Ghost",20000.99);
        // call the methods using object
        car1.display();
        car2.display();
        car3.display();
    }
}