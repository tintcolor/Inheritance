package com.anthony.polymorphism;

import com.anthony.pets.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testCompareTo() {

        //given
        Pet pet1 = new Cat();
        Pet pet2 = new Dog();
        pet1.setPetName("Ant");
        pet2.setPetName("Anth");
        List<Pet> list = new ArrayList<>();
        list.add(pet2);
        list.add(pet1);
        Collections.sort(list);
        int expectResult = -1;
        //when
        int actualResult = pet1.compareTo(pet2);

        //then
        assertTrue(expectResult == actualResult);
    }

    @Test
    public void testComparator() {
        //give
        Pet pet1 = new Cat();
        Pet pet2 = new Dog();
        CompareNames compareNames = new CompareNames();
        pet1.setPetName("ant");
        pet2.setPetName("Anth");
        List<Pet> list = new ArrayList<>();
        list.add(pet2);
        list.add(pet1);

        Collections.sort(list, compareNames);

    }


    @Test
    public void testLetter() {
        //give
        Pet pet1 = new Cat();
        Pet pet2 = new Dog();
        CompareNames compareNames = new CompareNames();
        pet1.setPetName("ant");
        pet2.setPetName("Ant");
        List<Pet> list = new ArrayList<>();
        list.add(pet1);//a
        list.add(pet2);//A

      //  Collections.sort(list);

        int expectResult = -1;
        //when
        int actualResult = compareNames.compare(pet1,pet2);//32  a.compareTo(A)


        Collections.sort(list, compareNames);
        System.out.println(actualResult);

        assertTrue(actualResult == 0); //-1<32

    }


}
