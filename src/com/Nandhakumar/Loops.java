package com.Nandhakumar;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Question : Print from 1 to 5
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }

        int n = 1;
        while(n<=5){
            System.out.println(n);
            n += 1;
        }

        do {
            System.out.println(n);
            n += 1;
        } while (n<=5);
    }
}
