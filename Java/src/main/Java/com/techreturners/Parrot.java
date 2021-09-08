package com.techreturners;

public class Parrot extends Bird {
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Here I comes " + name + " I am the sweetest  ");
    }
}
