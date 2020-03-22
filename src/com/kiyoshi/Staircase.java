package com.kiyoshi;

/*
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces.
The last line is not preceded by any spaces.
Write a program that prints a staircase of size.

n=4

#
##
###
####
* */

public class Staircase {
    public static void main(String[] args) {
        staircase(4);
        System.out.println();
        staircaseFor(4);
    }

    public static void staircase(Integer n){
        Integer control = 1;

        while(n > 0){
            System.out.println("#".repeat(control));
            control++;
            n--;
        }
    }

    public static void staircaseFor(Integer n){
        for(int i = 0; i < n; i++){
            System.out.println("#".repeat(i+1));
        }
    }
}
