package com.company;

import java.util.List;

public class CarnivoreCage implements CageInterface {
    private String meatType;
    public CarnivoreCage(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public void feedAnimals() {
          System.out.println("Feeding animals with " + meatType);
    }

    @Override
    public void feedAnimals(int watterGallons) {
        System.out.println("Feeding animals with " + meatType + " and "+ watterGallons + " of watter");
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal.getIsCarnivore() == false) {
            System.out.println("This animal can't stay here!");
        } else {
            System.out.println("It's ok, we can put it here.");
        }
    }

    @Override
    public String toString() {
        return "CarnivoreCage{" +
                "meatType='" + meatType + '\'' +
                '}';
    }
}
