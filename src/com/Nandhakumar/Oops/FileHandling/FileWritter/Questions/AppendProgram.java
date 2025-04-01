package com.Nandhakumar.Oops.FileHandling.FileWritter.Questions;

import java.io.FileWriter;
import java.io.IOException;

public class AppendProgram {
    public static void main(String[] args) {
        String filePath = "append.txt";
        String name = "Mamitha";
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            fileWriter.append(" Nandhakumar IAS");
            fileWriter.close();
            System.out.println("successfully appended");
        }
        catch (IOException e){
            System.out.println("error occurs program during is not append");
        }
    }
}
