package com.Nandhakumar.Oops.ExceptionHandling.Throw;

import java.util.Scanner;

// creating for this class is custom exception
class InvalidScoreException extends Exception{
    InvalidScoreException(String message){
        super(message);// call the parent constructor to passing the constructor value
    }
}

public class ThrowCustomException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        try{
            if (score<40){
                // creating custom exception
                throw new InvalidScoreException("Failing score");
            }
            System.out.println("your score is awesome");
        }
        catch (InvalidScoreException e){
            System.out.println(e.getMessage());
        }
    }
}
