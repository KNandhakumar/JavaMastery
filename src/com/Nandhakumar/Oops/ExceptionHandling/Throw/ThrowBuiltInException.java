package com.Nandhakumar.Oops.ExceptionHandling.Throw;

import java.util.Scanner;

public class ThrowBuiltInException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextByte();
        // using throw built in exception
        try{
            if (age<18){
                // throw the exception using throw keyword
                throw new IllegalArgumentException("you must be 18 or older");
            }
            System.out.println("access granted");
        }
        // give the exception from try block
        catch (Exception e){
            System.out.println(e);
        }
    }
}
