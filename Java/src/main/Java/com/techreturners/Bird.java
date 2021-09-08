package com.techreturners;

public abstract class Bird implements DanceImpl {
    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void speak();

    public void fly() {
        System.out.println("I am " + name + " I can fly high in the blue sky");
    }

    public void spin() {
        System.out.println(name + " I can Spin");
    }

    public void doTheCaterpillar() {
        System.out.println(name + " I can doTheCaterpillar");
    }

    public void jump() {
        System.out.println(name + " I can Jump");
    }
}

