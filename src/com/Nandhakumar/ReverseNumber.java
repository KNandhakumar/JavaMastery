package com.Nandhakumar;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 54321;
        int remainder = 0, reverse = 0;
        while (n>0){
            remainder = n%10;
            reverse = reverse*10+remainder;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
