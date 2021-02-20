package com.company;

public class HerbivoreCage implements CageInterface {
    private String plantsType;

    public HerbivoreCage(String plantsType) {
        this.plantsType = plantsType;
    }

    @Override
    public void feedAnimals() {
        System.out.println("Feeding animals with " + plantsType);
    }

    @Override
    public void feedAnimals(int watterGallons) {
        System.out.println("Feeding animals with " + plantsType + " and " + watterGallons + " of watter");
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal.getIsCarnivore() == true) {
            System.out.println("This animal can't stay here!");
        } else {
            System.out.println("It's ok, we can put it here.");
        }
    }

    @Override
    public String toString() {
        return "HerbivoreCage{" +
                "plantsType='" + plantsType + '\'' +
                '}';
    }
}