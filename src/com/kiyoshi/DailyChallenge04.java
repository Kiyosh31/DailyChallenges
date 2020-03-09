package com.kiyoshi;

/*
Hi, here's your problem today. This problem was recently asked by Facebook:
You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.

Example:
Given [4, 7, 1 , -3, 2] and k = 5,
return true since 4 + 1 = 5.

Try to do it in a single pass of the list.
*/

import java.util.HashMap;

public class DailyChallenge04 {
    public static void main(String[] args) {
        int[] nums = {4,7,1,-3,2};
        int k = 5;
        System.out.println(twoNumbers(nums, k));
        // true

        int[] nums1 = {2,7,11,15};
        k = 9;
        System.out.println(twoNumbers(nums1, k));
        // true
    }

    public static boolean twoNumbers(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement = 0;

        for(int i = 0; i < nums.length; i++){
            complement = k - nums[i];
            if(map.containsKey(complement)){
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
