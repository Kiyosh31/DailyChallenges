package com.kiyoshi;

public class Staircase {
    public static void main(String[] args) {
        staircase(10);
    }

    public static void staircase(Integer n){
        Integer control = 1;
        String myC = "#";

        while(n > 0){
            System.out.println(myC.repeat(control));
            control++;
            n--;
        }
    }
}
