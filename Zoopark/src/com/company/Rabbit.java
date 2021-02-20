package com.company;

public class Rabbit extends Animal{
    @Override
    public boolean getIsCarnivore() {
        return false;
    }

    @Override
    public void eat() {
        System.out.println("Eating carrots");
    }

    @Override
    public void sound() {
        System.out.println("Squeaking");
    }

    @Override
    public void move() {
        System.out.println("Jumping");
    }

    @Override
    public String toString() {
        return "Wolf -> eat: Eating carrots; sound: Squeaking; move: Jumping;";
    }
}
