package com.Nandhakumar;

import java.util.Scanner;

public class FindLargestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b & a>c){
            System.out.println("Largest Number is :" + "" + a);
        } else if (b>a & b>c) {
            System.out.println("Largest Number is :" + "" + b);
        }
        else {
            System.out.println("Largest Number is :" + "" + c);
        }

        // second approach
//        int max = a;
//        if (b>max){
//            max = b;
//        }  if (c>max) {
//            max = c;
//        }
//        System.out.println(max);
    }
}
