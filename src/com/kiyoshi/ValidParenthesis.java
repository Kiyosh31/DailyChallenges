package com.kiyoshi;

/*
20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true

Example 6:
Input: "["
Output: true
*/

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "()";
        System.out.println(isValid(input));
        // true

        input = "()[]{}";
        System.out.println(isValid(input));
        // true

        input = "(]";
        System.out.println(isValid(input));
        // false

        input = "([)]";
        System.out.println(isValid(input));
        // false

        input = "{[]}";
        System.out.println(isValid(input));
        // true

        input = "";
        System.out.println(isValid(input));
        // true

        input = ")";
        System.out.println(isValid(input));
        // false

        input = "[";
        System.out.println(isValid(input));
        // false

        input = "[]}";
        System.out.println(isValid(input));
        // false
    }

    public static boolean isValid(String input){
        if(input == null || input.isEmpty() || input == ""){
            return true;
        } else if(input.charAt(0) == ')' || input.charAt(0) == ']' || input.charAt(0) == '}'){
            return false;
        }

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{'){
                stack.push(input.charAt(i));
            } else if(input.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(' ||
                    input.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[' ||
                    input.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }  else {
                return false;
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
