package com.Nandhakumar.Oops.Static;

class Student{
    static String schoolName = "kmn bros higher secondary school";
}

// static is class level not an object level
public class StaticVariable {
    public static void main(String[] args) {
        System.out.println(Student.schoolName);
    }
}
