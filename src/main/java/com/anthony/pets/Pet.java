package com.anthony.pets;

import java.util.Comparator;

/**
 * Created by anthonyjones on 5/4/17.
 */
public class Pet implements Comparable<Pet> {

    String petName;

    @Override
    public int compareTo(Pet petName) //"A"
    {
        return this.getPetName().compareTo(petName.getPetName());  //a.compareTo("A")
    }


    public String speak() {
        return "...";
    }


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

}
