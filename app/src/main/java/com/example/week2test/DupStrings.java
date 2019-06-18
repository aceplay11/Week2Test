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
