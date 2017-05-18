package com.anthony.pets;

/**
 * Created by anthonyjones on 5/4/17.
 */
public class Dog extends Pet {

    public Dog(){}
    public Dog(String petName, String petType) {
        super(petName,petType);
    }

    @Override
    public String speak() {
        return "WoofWoof";
    }

    public String getPetName() {
        return petName;
    }

}
