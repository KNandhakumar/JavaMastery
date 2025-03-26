package com.Nandhakumar.WhileLoopQuestions;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int multiply = 1;
        while (n>0){
            multiply = multiply*n;
            n--;
        }
        System.out.println(multiply);
    }
}
