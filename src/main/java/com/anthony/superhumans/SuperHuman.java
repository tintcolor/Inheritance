package com.anthony.superhumans;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class SuperHuman extends Human {


    SuperHuman(String name, String gender, String occupation, String address, int age, String goodOrBad, String heroName, String superAbility) {
        super(name, gender, occupation, address, age);
        this.goodOrBad = goodOrBad;
        this.heroName = heroName;
        this.superAbilities = superAbility;
    }

    public void setGoodOrBad(String goodOrBad) {
        this.goodOrBad = goodOrBad;
    }

    @Override
    public String getGoodOrBad() {
        return goodOrBad;
    }

    @Override
    public String getHeroName() {
        return heroName;
    }

    @Override
    public String getSuperAbility() {
        return superAbilities;
    }
}

