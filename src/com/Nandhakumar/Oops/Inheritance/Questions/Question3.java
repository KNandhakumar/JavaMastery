package com.Nandhakumar.Oops.Inheritance.Questions;

class Animal1 {
    String type = "Animal";
}

class Dog1 extends Animal1{
    String type = "Dog";
    void display(){
        System.out.println("Animal class : " + super.type);
        System.out.println("Dog class : " + type);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.display();
    }
}
