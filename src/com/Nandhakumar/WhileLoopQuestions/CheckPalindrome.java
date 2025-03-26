package com.Nandhakumar.WhileLoopQuestions;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int check = n;
        int remiander = 0;
        int reverse = 0;
        while (n>0){
            remiander = n%10;
            reverse = reverse*10+remiander;
            n = n/10;
        }
        if (reverse==check){
            System.out.println(reverse + " " + "Palindrome");
        }
        else {
            System.out.println(reverse + " " + "Not Palindrome");
        }
    }
}
