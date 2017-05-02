package com.anthony.superhumans;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Main {
    public static void main(String[] args) {


        SuperHuman superMan = new SuperHuman("Clark Kent", "Male", "Reporter", "Metropolis",
                35, "Good", "Bad SuperMan", "Flight and SuperSpeed");

        superMan.setGoodOrBad("Bad");


        Human[] human = new Human[4];

        human[0] = new Human("Sarah Bleak", "Female", "Accountant", "California", 23);
        human[1] = superMan;
        human[2] = new SuperHuman("Luke Cage", "Male", "Janitor", "Harlem",
                32, "Good", "Luke Cage", "Super Strength");
        human[3] = new Human("Bob Dole", "Male", "Politician", "Kansas",
                93);

        for (Human typesOfHumans : human) {

            if (typesOfHumans instanceof SuperHuman) {
                System.out.println("Name:" + typesOfHumans.getName() + " Gender:" + typesOfHumans.getGender()
                        + " Occupation:" + typesOfHumans.getOccupation() + " Address:" + typesOfHumans.getAddress() + " Age:" + typesOfHumans.getAge() +
                        " Good or Bad:" + typesOfHumans.getGoodOrBad() + " Hero Name:"+ typesOfHumans.getHeroName()
                        + " Super Abilities:" + typesOfHumans.getSuperAbility());
                System.out.println();
            } else {
                System.out.println("Name:" + typesOfHumans.getName() + " Gender:" + typesOfHumans.getGender()
                        + " Occupation:" + typesOfHumans.getOccupation() + " Address:" + typesOfHumans.getAddress() + " Age:" + typesOfHumans.getAge());
                System.out.println();
            }

        }
    }


}



