package com.company;

public class Zoopark {

    //TODO export data and optionally add messages and capacity for cages similar to buildings

    public static void main(String[] args) {
        Wolf wolverine = new Wolf();
        Rabbit bugsBunny = new Rabbit();
        CageInterface cage1  = new CarnivoreCage();
        CageInterface cage2  = new CarnivoreCage();
        CageInterface cage3  = new CarnivoreCage();
        CageInterface cage4  = new CarnivoreCage();
        cage1.addAnimal(wolverine);
        cage1.addAnimal(bugsBunny);
        Building building1 = new Building(true, 3);
        building1.addCage(cage1);
        building1.addCage(cage2);
        building1.addCage(cage3);
        building1.addCage(cage4);
    }
}
