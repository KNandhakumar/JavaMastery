package com.Nandhakumar.Oops.Interface.Questions;

interface Payment{
    void payAmount(int amount);
}

class CreditCard implements Payment{
    public void payAmount(int amount){
        System.out.println("Paid " + amount + " using credit card");
    }
}

class Upi implements Payment{
    public void payAmount(int amount){
        System.out.println("Paid " + amount + " using upi");
    }
}

public class Bank {
    public static void main(String[] args) {
        // using interface reference variable
        Payment payment;
        // like this also same example : Payment payment = new CreditCard();

        // assigning credit card object
        payment = new CreditCard();
        payment.payAmount(1000);

        // assigning upi object
        payment = new Upi();
        payment.payAmount(500);
    }
}
