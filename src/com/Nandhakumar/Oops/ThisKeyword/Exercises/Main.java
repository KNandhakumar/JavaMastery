package com.Nandhakumar.Oops.ThisKeyword.Exercises;

class Student{
    String name;
    int age;
    String Profession;
    // constructor
    Student(String name,int age,String Work){
        // using this to assign values
        this.name = name;
        this.age = age;
        this.Profession = Work;
    }
    void display(){
        System.out.println("Name : " + name + " Age : " + age + " Profession : " + Profession);
    }
}

public class Main {
    public static void main(String[] args) {
        Student Nandhakumar = new Student("Nandhakumar",23,"IAS");
        Nandhakumar.display();
        Student Mami = new Student("Mamitha",23,"Singer");
        Mami.display();
    }
}
