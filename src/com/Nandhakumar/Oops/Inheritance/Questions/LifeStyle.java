package com.Nandhakumar.Oops.Inheritance.Questions;

class Nandhakumar{
    String name;
    int age;
    Nandhakumar(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Mami extends Nandhakumar{
    int salary;
    Mami(String name,int age,int salary){
        super(name,age);
        this.salary = salary;
    }
    void display(){
        super.display();
        System.out.println("Salary : " + salary);
    }
}

public class LifeStyle {
    public static void main(String[] args) {
        Mami mamitha = new Mami("mamitha Nandhakumar IAS",23,100000);
        mamitha.display();
    }
}
