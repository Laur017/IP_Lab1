package com.company;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private boolean isForCarnivore;
    public int nrOfCages;
    public List<CageInterface> cageList;

    public boolean getIsForCarnivore() {
        return isForCarnivore;
    }



    public Building (boolean isForCarnivore, int nrOfCagesLeft) {
        this.isForCarnivore = isForCarnivore;
        this.nrOfCages = nrOfCagesLeft;
        cageList = new ArrayList<CageInterface>();
    }

    public void addCage(CageInterface newCage){
        if(isForCarnivore == true && newCage.getClass() == CarnivoreCage.class ) {

            if(nrOfCages > cageList.size()) {
                cageList.add(newCage);
            } else {
                System.out.println("No more cages here!");
            }


            return;
        }
        if(isForCarnivore == false && newCage.getClass() == HerbivoreCage.class) {
            if(nrOfCages > cageList.size()) {
                cageList.add(newCage);
            } else {
                System.out.println("No more cages here!");
            }
            return;
        }
        System.out.println("We can't put carnivore and herbivore animals in the same building!");
    }

    @Override
    public String toString() {
        return "Building{" +
                "isForCarnivore=" + isForCarnivore +
                ", nrOfCages=" + nrOfCages +
                ", cageList=" + cageList +
                '}';
    }
}
