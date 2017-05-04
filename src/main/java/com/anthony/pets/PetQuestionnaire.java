package com.anthony.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class PetQuestionnaire {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        ArrayList<String> whatKindOfPet = new ArrayList<>();
        ArrayList<String> petName = new ArrayList<>();
        boolean hasMoreThanOnePet = false;
        System.out.println("How many pets do you own?");
        String howManyPets = in.nextLine();
        System.out.println(howManyPets);
        Pet cat = new Cat();
        Pet dog = new Dog();
        Pet fish = new Fish();
        String petSpeak="";

        System.out.println(cat.getClass().getSimpleName().toLowerCase());

        for (int i = 0; i < Integer.parseInt(howManyPets); i++) {
            if (hasMoreThanOnePet == false) {
                System.out.println("What kind of pet do you have?");
            } else {
                System.out.println("What kind of other pet do you have?");
            }
            //String a=  whatKindOfPet.add(in.nextLine());
            String petType = in.nextLine();
            whatKindOfPet.add(petType);

            if (petType.toLowerCase() == cat.getClass().getSimpleName().toLowerCase()) {
                petSpeak = cat.speak();
                System.out.println(petSpeak);
            } else if (petType.toLowerCase() == dog.getClass().getSimpleName().toLowerCase()) {
                petSpeak = dog.speak();
            } else if (petType.toLowerCase() == fish.getClass().getSimpleName().toLowerCase()) {
                petSpeak = fish.speak();
            }


            System.out.println("What is your " + whatKindOfPet.get(i) + "'s name?");
            petName.add(in.nextLine());
            hasMoreThanOnePet = true;
        }

        if (hasMoreThanOnePet == true) {
            System.out.print("You have " + howManyPets + " pets");
            for (int j = 0; j < Integer.parseInt(howManyPets); j++) {
                System.out.print(", a " + whatKindOfPet.get(j) + " named " + petName.get(j)+petSpeak);
            }
        } else {
            System.out.print("You have a " + whatKindOfPet.get(0) + " named " + petName.get(0));

        }
    }


}
