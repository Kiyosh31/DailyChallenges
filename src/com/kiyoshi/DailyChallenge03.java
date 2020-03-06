package com.kiyoshi;

/*
206. Reverse Linked List

Reverse a singly linked list.

Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

Follow up:
A linked list can be reversed either iteratively or recursively. Could you implement both?


*/

import java.util.Arrays;
import java.util.LinkedList;

public class DailyChallenge03 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(iterativeReverse(list1));
    }

    // O(N)
    public static LinkedList<Integer> iterativeReverse(LinkedList<Integer> input){
        LinkedList<Integer> output = new LinkedList<Integer>();

        for(int i = input.size() - 1; i >= 0; i--){
            output.add(input.get(i));
        }

        return output;
    }

    // O()
    /*public static LinkedList<Integer> recursiveReverse(LinkedList<Integer> input){

    }*/
}
