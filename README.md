# Week2Test

Coding Test Week 2

1. Sort the array with multiple same values in the array in an ascending order. 
Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
2. Say you have a string of characters. Write an algorithm to collect and return a list of all substrings such that order is maintained but characters may be skipped. So “frog” can produce fog, fg, rg, etc.
3. Given a 2d String array, write a method that will return a list with all the positions of
 dulpicate entries.   For example:

a,b,c
d,e,f
g,a,b

will return {0,0 | 0,1 | 2,1 | , 2,2 }

4. Complete the Jungle Coding Challenge

package com.example.week2test;


import android.util.Log;

import java.util.Arrays;

public class SortArray {
    public static void arraySort(int [] x) {

            //Sorts array in ascending order
            Arrays.sort(x);

            System.out.println(Arrays.toString(x));



    }

    public static void main(String[] args) {

        int[] ray = {1, 4, 5, 3, 5, 4, 7, 1, 5, 4, 3, 3, 8, 5, 9, 8, 9, 8, 9};

        arraySort(ray);

    }
}


package com.example.week2test;

public class Substringing {
    public static void subStringing(String original, String combined) {
        //prints out the combinations
        //combined is initial empty because there is nothing to combine
        System.out.println(combined);

        //recursive loop to find all sub strings combinations while maintaining order
        for (int i = 0; i < original.length(); i++) {
            subStringing(original.substring(i + 1), combined + original.charAt(i));

        }
    }

    public static void main(String[] args) {
        String a = "ABCD";
        String b = "Pyramid";

        subStringing(a, "");
        subStringing(b, "");


    }
}


package com.example.week2test;

import java.util.HashSet;

public class DupStrings {

    public static void dupStringPosition(String[][] string) {
//      HashSet to put duplicates in
        HashSet hashSet = new HashSet();

        //First 2 loops create a 2d array
        for (int i = 0; i < string.length; i++) {
            for (int j = 0; j < string[i].length; j++) {

                //Second 2 loops create an identical 2d array for comparison
                for (int k = 0; k < string.length; k++) {
                    for (int l = 1; l < string[k].length; l++) {

                        //IF to remove self comparison duplicates found from loop
                        if (string[i][j] == string[k][l]) {
                            if (i != k && j != l) {

                                //Stringed indexes to be stored in HashSet
                                String firstIndex = i + "," + j;
                                String secondIndex = k + "," + l;

                                //Added both pair to HashSet to remove duplicates indexes
                                hashSet.add(firstIndex);
                                hashSet.add(secondIndex);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(hashSet);
    }


    public static void main(String[] args) {
        String[][] dd = {{"a", "b", "c", "f"},
                {"b", "c", "e", "p"},
                {"e", "i", "o", "t"}};

        dupStringPosition(dd);
    }
}


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


package com.example.week2test;

//No edits need for Snake due the instructions
public class Snake extends Jungle {

}


package com.example.week2test;

//Override sleepJungle to add 5 instead of 10 to energy
public class Tiger extends Jungle {

    @Override
    public void sleepJungle() {
        energy += 5;
    }
}

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
