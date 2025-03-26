package com.Nandhakumar.WhileLoopQuestions;

import java.util.Scanner;

public class FindSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder = 0;
        int sum = 0;
        if (n==0){
            sum = 0;
        }
        n = Math.abs(n);
        while (n>0){
            remainder = n%10;
            sum+=remainder;
            n = n/10;
        }
        System.out.println(sum);
    }
}
