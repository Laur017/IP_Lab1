package com.company;

public class Wolf extends Animal {


    @Override
    public boolean getIsCarnivore() {
        return true;
    }

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }

    @Override
    public void sound() {
        System.out.println("Barking");
    }

    @Override
    public void move() {
        System.out.println("Running");
    }

    @Override
    public String toString() {
        return "Wolf -> eat: Eating meat; sound: Barking; move: Running;";
    }
}
