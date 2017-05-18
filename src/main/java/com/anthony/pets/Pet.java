package com.anthony.pets;


/**
 * Created by anthonyjones on 5/4/17.
 */
public class Pet implements Comparable<Pet> {

    String petName;
    String petType;

    public Pet(){}

    Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;
    }

    @Override
    public int compareTo(Pet petName) //"A"
    {
        return this.getPetName().compareTo(petName.getPetName());  //a.compareTo("A")
    }


    public String speak() {
        return "...";
    }

    public String getPetType(){return petType;}


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

}
