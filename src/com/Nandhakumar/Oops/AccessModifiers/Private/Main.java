package com.Nandhakumar.Oops.AccessModifiers.Private;

class BankAccount{
    private int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    void deposit(){
        System.out.println(balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit();
    }
}
