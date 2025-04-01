package com.Nandhakumar.Oops.ExceptionHandling.Finally.Questions.Q1;

public class Question1 {
    public static void main(String[] args) {
        try {
            System.out.println("try block executed");
        } catch (Exception e){
            System.out.println("no exception");
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
