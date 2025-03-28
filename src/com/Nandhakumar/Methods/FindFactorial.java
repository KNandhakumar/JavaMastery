package com.Nandhakumar.Methods;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

    static int factorial(int n){
        int multiply = 1;
        for (int i = n; i>=1; i--) {
            multiply = multiply*i;
        }
        return multiply;
    }
}
