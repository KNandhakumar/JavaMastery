package com.Nandhakumar.Oops.Final;

public class FinalVariable {
    public static void main(String[] args) {
        // using without final keyword
        double PI = 3.14;
        PI = 10;
        System.out.println(PI);
        // using with final keyword
        final int num = 10;
//        num = 5;  // cannot be change the value because final is constant
        System.out.println(num);
    }
}
