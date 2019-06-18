package com.example.week2test;

//Adds a playJungle Method
public class Monkey extends Jungle {

    public void playJungle() {

        if (energy > 8) {
            energy -= 8;
            System.out.println("Oooo! Oooo! Oooo!");
        } else {
            System.out.println("Monkey to tired");
        }

    }

    //Overrides eatJungle to provide 2 energy instead of 4
    @Override
    public void eatJungle() {
        energy += 2;

    }

    //Overrides soundOffJungle to use 4 energy instead of 3
    @Override
    public void soundOffJungle(String sound) {
        energy -= 4;
        System.out.println(sound + " my energy is " + energy);

    }
}
