package com.kiyoshi;

/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        // [0,1]

        int[] nums1 = {1,2,3,4,5};
        target = 6;
        System.out.println(Arrays.toString(twoSum(nums1, target)));
        // [1, 3]
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement = 0;

        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No hay solucion");
    }
}
