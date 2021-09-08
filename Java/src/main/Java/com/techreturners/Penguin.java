package com.techreturners;

public class Penguin extends Bird {

    public Penguin(String name, String color) {
        super(name, color);
    }


    @Override
    public void speak() {
        System.out.println("yo ! I am " + name + " and  I am  " + color + " Penguin");
    }

    @Override
    public void fly() {
        System.out.println("I am " + name + "  I can't fly , its not fair!");
    }

}
