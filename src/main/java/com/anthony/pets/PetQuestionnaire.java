package com.anthony.pets;

import java.util.ArrayList;
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
    ArrayList<String> whatKindOfPet = new ArrayList<>();
    ArrayList<String> petSpeak = new ArrayList<>();
    ArrayList<String> petName = new ArrayList<>();
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
            whatKindOfPet.add(petType);
            System.out.println("What is your " + whatKindOfPet.get(i) + "'s name?");
            String petName = in.nextLine();
            this.petName.add(petName);
            petClassesWeHaveOptionsOf(petType);
            hasMoreThanOnePet = true;
        }
        finalOutput(petNumber);
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

    void finalOutput(int howManyPets){
        System.out.print("You have " + howManyPets + " pet(s)");
        for (int j = 0; j < howManyPets; j++) {
            System.out.print(", a " + whatKindOfPet.get(j) + " named " + petName.get(j) + " *" + petSpeak.get(j) + "* ");
        }
    }

}

