package com.Nandhakumar.Oops.FileHandling.FileWritter.FileReader.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Love.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // text read using buffered reader
            String line = bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
            System.out.println("successfully read");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
