package com.kiyoshi;
/*
    Hi, here's your problem today. This problem was recently asked by AirBNB:

    Given a sorted array, A, with possibly duplicated elements,
    find the indices of the first and last occurrences of a target element, x.
    Return -1 if the target is not found.

    Example:
    Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
    Output: [6,8]

    Input: A = [100, 150, 150, 153], target = 150
    Output: [1,2]

    Input: A = [1,2,3,4,5,6,10], target = 9
    Output: [-1, -1]


    FINISHED
*/

import java.util.Arrays;

public class DailyChallenge02 {
    public static void main(String[] args) {
        // [4,6]
        int[] A = {0,1,2,3,6,6,6,7,8,9};
        int target = 6;
        System.out.println(Arrays.toString(pairsOfIndex(A, target)));

        // [6,8]
        int[] B = {1,3,3,5,7,8,9,9,9,15};
        target = 9;
        System.out.println(Arrays.toString(pairsOfIndex(B, target)));

        // [1,2]
        int[] C = {100, 150, 150, 153};
        target = 150;
        System.out.println(Arrays.toString(pairsOfIndex(C, target)));

        // [-1, -1]
        int[] D = {1,2,3,4,5,6,10};
        target = 9;
        System.out.println(Arrays.toString(pairsOfIndex(D, target)));
    }

    // O(N)
    public static int[] pairsOfIndex(int[] A, int target){
        int[] output = new int[2];

        for(int i = 0; i < A.length; i++){
            if(A[i] == target){
                output[0] = i;
                break;
            }
            output[0] = -1;
        }

        for(int j = A.length - 1; j >= 0; j--){
            if(A[j] == target){
                output[1] = j;
                break;
            }
            output[1] = -1;
        }

        return output;
    }
}
