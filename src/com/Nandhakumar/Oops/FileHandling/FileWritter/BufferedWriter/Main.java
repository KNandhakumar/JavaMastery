package com.Nandhakumar.Oops.FileHandling.FileWritter.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // create object for BufferedWriter class to use for write
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffer.txt",true));
            // write text using bufferWriter object
            bufferedWriter.write("Name : Nandhakumar IAS, Age : 23");
            bufferedWriter.newLine();
            // append text
            bufferedWriter.append("Name : Mamitha Nandhakumar IAS, Age : 23");
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("file written successfully");

        }
        catch (IOException e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
