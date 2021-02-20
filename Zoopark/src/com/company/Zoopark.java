package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Zoopark {

    //TODO export data and optionally add messages and capacity for cages similar to buildings

    public static void main(String[] args) {
        Wolf wolverine = new Wolf();
        Rabbit bugsBunny = new Rabbit();
        CageInterface cage1  = new CarnivoreCage("beef");
        CageInterface cage2  = new CarnivoreCage("chicken");
        CageInterface cage3  = new CarnivoreCage("pork");
        CageInterface cage4  = new HerbivoreCage("carrots");
        cage1.addAnimal(wolverine);
        cage2.addAnimal(bugsBunny);
        Building building1 = new Building(true, 3);
        Building building2 = new Building(false, 3);
        building1.addCage(cage1);
        building1.addCage(cage2);
        building1.addCage(cage3);
        building2.addCage(cage4);

        try {
            File exportFile = new File("export.txt");
            if (exportFile.createNewFile()) {
                System.out.println("File created: " + exportFile.getName());
            }
            PrintWriter out;
            out = new PrintWriter("export.txt");
            out.println(building1.toString());
            for (var cage : building1.cageList) {
                out.println(cage.toString());
            }out.println(building2.toString());

            for (var cage : building2.cageList) {
                out.println(cage.toString());

            }

            out.println(wolverine.toString());
            out.println(bugsBunny.toString());

            out.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
