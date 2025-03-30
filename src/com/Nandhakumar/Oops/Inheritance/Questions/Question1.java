package com.Nandhakumar.Oops.Inheritance.Questions;

// super class
class Person{
    String name;
    int age;
    // constructor for person class
    Person(String name,int age){
        this.name = name;
        this.age  = age;
    }

    // methods to display person details
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Employee extends Person{
    int salary;
    // constructor for person class
    Employee(String name,int age,int salary){
        super(name,age);  // calling parent constructor
        this.salary = salary;
    }

    // method to display employee details
    void display(){
        super.display(); // calling the parent class display method
        System.out.println("Salary : " + salary);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Nandhakumar",23,100000);
        employee.display(); // displaying employee details
    }
}
