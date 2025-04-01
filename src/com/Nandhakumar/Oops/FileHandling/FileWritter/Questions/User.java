package com.Nandhakumar.Oops.FileHandling.FileWritter.Questions;

import java.io.FileWriter;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        try{
            FileWriter fileWriter = new FileWriter("userOutput.txt");
            fileWriter.write(name);
            fileWriter.close();
            System.out.println("file write successfully");
        }
        catch (Exception e){
            System.out.println("something has happened");
        }
    }
}
