package com.anthony.pets;

/**
 * Created by anthonyjones on 5/4/17.
 */
public class Cat extends Pet {

    public Cat(){}
    public Cat(String petName, String petType) {
        super(petName,petType);
    }

    @Override
    public String speak() {
        return "Meoooow";
    }
}
