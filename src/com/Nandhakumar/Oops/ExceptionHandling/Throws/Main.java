package com.Nandhakumar.Oops.ExceptionHandling.Throws;

class Calculator {
    void divideNumbers(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator divide = new Calculator();
        try {
            divide.divideNumbers(10,0);
        }
        catch (ArithmeticException e){
            System.out.println("Error found : not divide by 0");
        }
    }
}
