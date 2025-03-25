package com.Nandhakumar;

public class Conditionals {
    public static void main(String[] args) {
        int age = 17;
        if (18<=age){ // the statement is true it will run
            System.out.println("vote karo");
        }
        else if (17<=age){ // if not true then check if else is true it'll run
            System.out.println("hey bro wait one year,next year you can vote");
        }
        else{ // if , if else not run, else block run
            System.out.println("not eligible");
        }
    }
}
