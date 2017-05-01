package com.anthony.superhumans;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Human {

    String name;
    String gender;
    String occupation;
    String address;
    int age;


    Human(String name, String gender, String occupation, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getGoodOrBad() {
        return "";
    }
}
