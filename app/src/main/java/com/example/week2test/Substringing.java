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
