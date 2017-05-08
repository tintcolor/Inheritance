package com.anthony.pets;

import java.util.Comparator;

/**
 * Created by anthonyjones on 5/5/17.
 */
public class CompareNames implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {

        o1.getClass().toString().compareToIgnoreCase(o2.getClass().toString().toLowerCase());


        return o1.getPetName().compareToIgnoreCase(o2.getPetName().toLowerCase());
    }
}
