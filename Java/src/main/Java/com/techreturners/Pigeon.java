package com.techreturners;

public class Pigeon extends Bird {

    public Pigeon(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("My name is " + name + " and I am a " + color + " pigeon");
    }

    public void eatPizza() {
        System.out.println("Delicious Pizza");
    }

    public void sleep() {
        System.out.println("I am a sleeping " + name);
    }

}
