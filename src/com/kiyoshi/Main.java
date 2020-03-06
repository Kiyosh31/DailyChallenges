package com.kiyoshi;

/*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Example:
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.

    FINISHED
*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(2, 4, 3));
        LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(5, 6, 4));

        System.out.println(reverseListFancy(list1, list2));
    }

    // O(N)
    public static LinkedList<Integer> reverseListFancy(LinkedList<Integer> input1, LinkedList<Integer> input2) {
        LinkedList<Integer> output = new LinkedList<Integer>();
        String a = "";
        String b = "";
        String result = "";

        ListIterator li = input1.listIterator(input1.size());

        if(input1.size() == input2.size()){
            ListIterator li2 = input2.listIterator(input2.size());

            while (li.hasPrevious() && li2.hasPrevious()) {
                a += li.previous();
                b += li2.previous();
            }
        } else {
            while (li.hasPrevious()) {
                a += li.previous();
            }

            li = input2.listIterator(input2.size());
            while (li.hasPrevious()) {
                b += li.previous();
            }
        }

        result = Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));

        for(int i = result.length() - 1; i >= 0; i--){
            output.add(Character.getNumericValue(result.charAt(i)));
        }

        return output;
    }
}
