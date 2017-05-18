package com.anthony.pets;

/**
 * Created by anthonyjones on 5/4/17.
 */
public class Fish extends Pet {

    public Fish() {
    }

    public Fish(String petName, String petType) {
        super(petName, petType);

    }

    @Override
    public String speak() {
        return "BubbleBubble";
    }


}

