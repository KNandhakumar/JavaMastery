package com.Nandhakumar.Oops.Inheritance.MultiLevel;

class Pigeon{
    void drink(){
        System.out.println("It can drink");
    }
}

class Dog extends Pigeon{
    void Eat(){
        System.out.println("It can eat");
    }
}

class Fish extends Dog{
    void swim(){
        System.out.println("It swim");
    }
}

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.drink();
        fish.Eat();
        fish.swim();
    }
}
