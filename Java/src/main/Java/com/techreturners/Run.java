package com.techreturners;

public class Run {
    public static void main(String[] args) {
//        Bird myBird = new Bird("Tweety","Blue");
//        myBird.speak();
//        myBird.fly();

        Pigeon myPigeon = new Pigeon("Pippa", "grey");
        myPigeon.speak();
        myPigeon.fly();
        myPigeon.eatPizza();
        myPigeon.sleep();
        myPigeon.spin();
        myPigeon.jump();
        myPigeon.doTheCaterpillar();

        Penguin myPenguin = new Penguin("Pingu", "Black and White");
        myPenguin.speak();
        myPenguin.fly();
        myPenguin.spin();
        myPenguin.jump();
        myPenguin.doTheCaterpillar();

        Parrot myParrot = new Parrot("Mithu", "Green");
        myParrot.speak();
    }
}
