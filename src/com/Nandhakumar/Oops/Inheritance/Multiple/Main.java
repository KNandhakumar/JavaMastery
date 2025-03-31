package com.Nandhakumar.Oops.Inheritance.Multiple;

interface Animal{
    void makeSound();
}

interface Dog{
    void makeSound();
}

// can be implement multiple classes using interface, this is multiple inheritance
class Pigeon implements Animal, Dog{
    public void makeSound(){
        System.out.println("Pigeon");
    }
}

public class Main {
    public static void main(String[] args) {
        Pigeon pura = new Pigeon();
        pura.makeSound();
    }
}
