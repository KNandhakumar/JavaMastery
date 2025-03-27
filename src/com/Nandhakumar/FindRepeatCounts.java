package com.Nandhakumar;

public class FindRepeatCounts {
    public static void main(String[] args) {
        int n = 1385757879;
        int count = 0;
        int remainder = 0;
        while (n>0){
            remainder = n%10;
            n = n/10;
            if (remainder==7){
                count++;
            }
        }
        System.out.println(count);
    }
}
