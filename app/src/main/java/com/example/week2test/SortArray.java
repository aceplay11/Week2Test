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
