package com.kiyoshi;

/*
    205. Isomorphic Strings

    Given two strings s and t, determine if they are isomorphic.
    Two strings are isomorphic if the characters in (s) can be replaced to get (t).
    All occurrences of a character must be replaced with another character while preserving the order of characters.
    No two characters may map to the same character but a character may map to itself.
*/

import java.util.Hashtable;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("cucei", "paper"));
        // true

        System.out.println(isIsomorphic("foo", "bar"));
        // false
    }

    // para este ejercicio se nos da a entender que (s) y (t) tienen el mismo tamaño
    public static boolean isIsomorphic(String s, String t){
        if(s == null || t == null && s.length() != t.length())
            return false;

        Hashtable<Character, Character> hashtable = new Hashtable<Character, Character>();

        for(int i = 0; i < s.length(); i++){
            if(hashtable.containsKey(s.charAt(i)) && hashtable.get(s.charAt(i)) != t.charAt(i) ||
                    !hashtable.containsKey(s.charAt(i)) && hashtable.containsValue(t.charAt(i))){
                return false;
            }

            if(!hashtable.containsKey(s.charAt(i))){
                hashtable.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}
