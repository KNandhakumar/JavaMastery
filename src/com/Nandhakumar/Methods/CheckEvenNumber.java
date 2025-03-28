package com.Nandhakumar.Methods;

import java.util.Scanner;

public class CheckEvenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isEven(num);
        System.out.println(ans);
    }

    static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
