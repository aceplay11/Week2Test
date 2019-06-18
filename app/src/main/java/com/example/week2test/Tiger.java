package com.example.week2test;

//Override sleepJungle to add 5 instead of 10 to energy
public class Tiger extends Jungle {

    @Override
    public void sleepJungle() {
        energy += 5;
    }
}
