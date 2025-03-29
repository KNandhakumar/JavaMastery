package com.Nandhakumar.Oops.Inheritance;

class Nandhakumar{
    String name = "Nandhakumar IAS";
    int salary = 100000;
    Boolean MyLove = true;
}

// access the nk class to mami this is inheritance
class Mami extends Nandhakumar{

}

public class Main {
    public static void main(String[] args) {
        Mami mamitha = new Mami();
        System.out.println("mamitha" + " " + mamitha.name);
        System.out.println("Mamitha Salary :" + mamitha.salary);
        System.out.println("mamitha Love :" + " " + mamitha.MyLove);
    }
}
