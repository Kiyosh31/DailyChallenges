package com.kiyoshi;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
*/

import java.util.Stack;

public class ValidPalindrome {
    public static void main(String[] args) {
        String word = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(word));
        // true

        word = "race a car";
        System.out.println(isPalindrome(word));
        // false

        word = "A man, a plan, a canal -- Panama";
        System.out.println(isPalindrome(word));
        // true
    }

    public static boolean isPalindrome(String word){
        if(word.isEmpty())
            return true;

        String newWord = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int i = 0;
        int j = newWord.length() - 1;

        while (i < j){
            if(newWord.charAt(i) != newWord.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
