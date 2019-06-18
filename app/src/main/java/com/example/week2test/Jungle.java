package com.example.week2test;

//Parent Class that all children inherits
public class Jungle {

    int energy = 10;

    public Jungle() {
    }

    public  void sleepJungle(){
        energy += 10;
    }

    public void eatJungle(){
        energy += 5;
    }

    public void soundOffJungle(String sound){
        energy -= 3;
        System.out.println(sound + " my energy is " + energy);
    }

    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        Tiger tiger1 = new Tiger();
        Snake snake1= new Snake();

        monkey1.playJungle();
        tiger1.sleepJungle();
        tiger1.soundOffJungle("Roar");
        monkey1.playJungle();
        snake1.soundOffJungle("Hissing");
        monkey1.eatJungle();
        monkey1.soundOffJungle("Oooo!");

    }
}
