package com.Nandhakumar.Oops.Inheritance.Questions;

class Vehicle1{
    void showDetails(){
        System.out.println("engine starts");
    }
}

 class Car1 extends Vehicle1{
    void showDetails(){
        super.showDetails();
        System.out.println("engine not start");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Car1 Aadi = new Car1();
        Aadi.showDetails();
    }
}
