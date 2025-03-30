package com.Nandhakumar.Oops.Abstract;

// abstract class
abstract class Animal{
    // abstract method only have in abstract class
    // abstract method dont have body
    // must be subclasses override abstract method
    abstract void makeSound();

    void eat(){
        System.out.println("it can eat");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
     Dog husky = new Dog();
     husky.makeSound();
     husky.eat();
    }
}
