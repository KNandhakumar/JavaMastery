package com.Nandhakumar.Oops.ExceptionHandling.Questions;

import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        try {
            System.out.println("a/b = " + a/b);
        }
        catch (ArithmeticException e){
            System.out.println("error handled : " + e);
        }
    }
}
