package com.ssk.java.dsaprep.collections.stack;
/*
	Problem: Given an array of integers, the task is to find the closest previous greater element for every element of the given array.
            Note: If there doesn't exist any previous greater element for any element, print -1. Previous greater for the first element of the array will always be -1.
            Example:
            Input: arr[] = {15, 10, 18, 12, 4, 6, 2, 8}
            Output: -1, 15, -1, 18, 12, 12, 6, 12

 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] input={15, 10, 18, 12, 4, 6, 2, 8};
        new PreviousGreaterElement().printNearestGreaterNumber(input);
    }

    public void printNearestGreaterNumber(int[] input){
        Deque<Integer> greatestStack=new ArrayDeque<>();
        String output=-1+"";
        // initialize first element
        greatestStack.push(input[0]);
        System.out.print(output);

        for(int i=1;i<input.length;i++){
            while(!greatestStack.isEmpty()&&input[i]>=greatestStack.peek()){
                greatestStack.pop();
            }
            output=greatestStack.isEmpty()?", "+-1:", "+greatestStack.peek();
            System.out.print(output);
            greatestStack.push(input[i]);
        }
    }
}
