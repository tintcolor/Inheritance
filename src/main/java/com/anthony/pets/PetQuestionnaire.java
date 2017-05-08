package com.anthony.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class PetQuestionnaire {


    Pet cat = new Cat();
    Pet dog = new Dog();
    Pet pet = new Pet();
    Pet fish = new Fish();
    Scanner in = new Scanner(System.in);
    ArrayList<String> listOfTypesOfPets = new ArrayList<>();
    ArrayList<String> petSpeak = new ArrayList<>();
    ArrayList<String> listOfPetNames = new ArrayList<>();
    ArrayList<ArrayList> listOfArrays = new ArrayList<>();
    ArrayList<String> pets = new ArrayList<>();

    boolean hasMoreThanOnePet = false;

    PetQuestionnaire() {
        System.out.println("How many pets do you own?");
        String howManyPets = in.nextLine();
        System.out.println(howManyPets);
        int petNumber = Integer.parseInt(howManyPets);

        for (int i = 0; i < Integer.parseInt(howManyPets); i++) {
            if (hasMoreThanOnePet == false) {
                System.out.println("What kind of pet do you have?");
            } else {
                System.out.println("What kind of other pet do you have?");
            }
            String petType = in.nextLine();
            listOfTypesOfPets.add(petType);
//            pets.add(petType);
            System.out.println("What is your " + listOfTypesOfPets.get(i) + "'s name?");
            String petName = in.nextLine();
            this.listOfPetNames.add(petName);
            listOfArrays.add(listOfPetNames);
            pets.add(petType+" "+" "+petName);
            petClassesWeHaveOptionsOf(petType);
            hasMoreThanOnePet = true;
        }
        listOfArrays.add(listOfPetNames);
        listOfArrays.add(listOfTypesOfPets);
        listOfArrays.add(petSpeak);

       // finalOutput(petNumber);
         looper();
    }

    void petClassesWeHaveOptionsOf(String petType) {

        if (petType.toLowerCase().trim().equals(cat.getClass().getSimpleName().toLowerCase().trim())) {
            petSpeak.add(cat.speak());
        } else if (petType.toLowerCase().trim().equals(dog.getClass().getSimpleName().toLowerCase().trim())) {
            petSpeak.add(dog.speak());
        } else if (petType.toLowerCase().trim().equals(fish.getClass().getSimpleName().toLowerCase().trim())) {
            petSpeak.add(fish.speak());
        } else {
            petSpeak.add(pet.speak());
        }

    }


    void looper(){
        Collections.sort(pets);
        System.out.print(pets);
        for (int j = 0; j < 3; j++) {
        //    System.out.print(pets);
        }
    }

    void finalOutput(int howManyPets){
        Collections.sort(listOfPetNames);
        System.out.print("You have " + howManyPets + " pet(s)");
        for (int j = 0; j < howManyPets; j++) {
            System.out.print(", a " + listOfTypesOfPets.get(j) + " named " + listOfPetNames.get(j) + " *" + petSpeak.get(j) + "* ");
        }
    }

}

