package com.anthony.pets;

/**
 * Created by anthonyjones on 5/4/17.
 */
public class Dog extends Pet {

    @Override
    public String speak() {
        return "WoofWoof";
    }

    public String getPetName() {
        return petName;
    }

}
