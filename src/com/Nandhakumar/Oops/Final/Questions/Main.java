package com.Nandhakumar.Oops.Final.Questions;

class ConstantValues{
     final double PI = 3.14;
}

// cannot be inherit when the class is final
//class Student extends ConstantValues{
//
//}

class Student1 extends ConstantValues{

}

public class Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1(); // object for ConstantValues class
//        student1.PI = 10.0; // override the value
//        System.out.println(student1.PI); // it overrided
        // try to override the final variable PI value
//        student1.PI = 10; // cannot be override the final variable
    }
}
