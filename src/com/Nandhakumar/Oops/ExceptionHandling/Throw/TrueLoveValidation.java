package com.Nandhakumar.Oops.ExceptionHandling.Throw;

import java.util.Scanner;

class NotTrueLoveException extends Exception{
    NotTrueLoveException(String message){
        super(message);
    }
}

public class TrueLoveValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1 = in.next();
        String name2 = in.next();

        try{
            if (name1.equals("mamitha") && name2.equals("nandhakumar")){
                System.out.println("True Love Exists❤️😍");
            }
            else {
                throw new NotTrueLoveException("This is not true love");
            }
        }
        catch (NotTrueLoveException e){
            System.out.println(e.getMessage());
        }
    }
}
