package com.Nandhakumar.Oops.ThisKeyword;

public class MyDream {
    String name;
    int age;
    String love;
    // Default constructor
    MyDream(String name,int age,String love){
        this.name = name;
        this.age = age;
        this.love = love;
    }
    // creating method
    void changeGoal(){
        System.out.println("My Name :" + " "+name);
        System.out.println("My Age :" + " "+age);
        System.out.println("My Love :" + " "+love);
    }
    public static void main(String[] args) {
        MyDream me = new MyDream("Nandhakumar",23,"Mami IAS");
        me.changeGoal();
    }
}
