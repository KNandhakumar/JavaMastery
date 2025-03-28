package com.Nandhakumar.Methods;

public class FindMax {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(findMaxValue(a,b));
    }

    static int findMaxValue(int a, int b){
        return Math.max(a,b);
    }
}
