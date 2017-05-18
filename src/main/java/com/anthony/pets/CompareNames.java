package com.anthony.pets;

import java.util.Comparator;

/**
 * Created by anthonyjones on 5/5/17.
 */
public class CompareNames implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {

        o1.getPetType().compareTo(o2.getPetType());
        if (o1.getPetType().compareTo(o2.getPetType()) == 0) {
            return o1.getPetName().compareTo(o2.getPetName());
        }
        return o1.getPetType().compareTo(o2.getPetType());
    }
}
