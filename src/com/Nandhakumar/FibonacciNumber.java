package com.Nandhakumar;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        int ans = 0;
        for (int i = 2; i < n; i++) {
            ans = a+b;
            a = b;
            b = ans;
        }
        System.out.println(ans);
    }
}
