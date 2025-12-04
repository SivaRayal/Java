package com.ssk.java.dsaprep.collections.stack;


/*
	Problem: Given an array, print the Next Greater Element(NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider next greater element as -1.

            Example:
            Input: arr[] = {4, 5, 2, 25}
            Output:
            Element       NGE
            4      -->   5
            5      -->   25
            2      -->   25
            25     -->   -1
*/

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] input = {1,2,4,6,8,10};
        new NextGreaterElement().getNextGreaterElement(input);
    }

    public void getNextGreaterElement(int[] input){
        Deque<Integer> auxStack=new ArrayDeque<>();
        int[] output=new int[input.length];

        // initilize
        output[input.length-1]=-1;
        auxStack.push(input[input.length-1]);


        // iterate for remaining all the elements
        for(int i=input.length-2;i>=0;i--){
            while(!auxStack.isEmpty() && input[i]>=auxStack.peek()){
                auxStack.pop();
            }
            output[i]=auxStack.isEmpty()?-1:auxStack.peek();

            // add next element for next iteration
            auxStack.push(input[i]);
        }

        Arrays.stream(output).forEach(System.out::println);
    }
}
