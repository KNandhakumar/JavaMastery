package com.Nandhakumar.Oops.FileHandling.FileWritter;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        // file writer object only have in try catch block because if this fw give value or not
        try{
            // creating object for File writer class from import java.io
            // we need to append another name in file writing,
            // we can object constructor add the true, then we can append
            FileWriter fileWriter = new FileWriter("output.txt",true);
            // write the value using write method
//            fileWriter.write("Nandhakumar");
            // append method using add texts
            fileWriter.append(" IAS");
            // close the file writer
            fileWriter.close();
            // check the file saved or not
            System.out.println("successfully file wrote");
        } catch (Exception e){
            System.out.println("something has happened");
        }
    }
}
