package com.anthony.polymorphism;

import com.anthony.pets.Cat;
import com.anthony.pets.Dog;
import com.anthony.pets.Fish;
import com.anthony.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class testPet {


    @Test
    public void testCatSpeak() {
        //given
        Pet cat = new Cat();
        String expectedResponse = "Meoooow";
        //when
        String actualResponse = cat.speak();
        //then
        Assert.assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testDogSpeak() {
        //given
        Pet dog = new Dog();
        String expectedResponse = "WoofWoof";
        //when
        String actualResponse = dog.speak();
        //then
        Assert.assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testFishSpeak() {
        //given
        Pet fish = new Fish();
        String expectedResponse = "BubbleBubble";
        //when
        String actualResponse = fish.speak();
        //then
        Assert.assertEquals(expectedResponse, actualResponse);
    }


    @Test
    public void testGetPetDogName() {
        //given
        Pet dog = new Dog();
        String expectedResponse = "Fluffy";
        //when
        dog.setPetName("Fluffy");
        String actualResponse = dog.getPetName();
        //then
        Assert.assertEquals(expectedResponse, actualResponse);
    }


    @Test
    public void testGetPetCatName() {
        //given
        Pet cat = new Cat();
        String expectedResponse = "Catalie Portman";
        //when
        cat.setPetName("Catalie Portman");
        String actualResponse = cat.getPetName();
        //then
        Assert.assertEquals(expectedResponse, actualResponse);
    }


    @Test
    public void testGetPetFishName() {
        //given
        Pet fish = new Fish();
        String expectedResponse = "Winnie the Poodle";
        //when
        fish.setPetName("Winnie the Poodle");
        String actualResponse = fish.getPetName();
        //then
        Assert.assertEquals(expectedResponse, actualResponse);
    }


}
