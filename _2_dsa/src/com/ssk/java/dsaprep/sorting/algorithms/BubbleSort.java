package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before bubble sort - "+ Arrays.toString(inputArr));
        new BubbleSort().bubbleSort(inputArr);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    public void bubbleSort(int[] inputArr){
        // start from 0 index in left seub arr
        for(int l=0;l<inputArr.length;l++)
            // start from 0 to n-l-1 index in right sub arr
            for(int r=0;r<inputArr.length-l-1;r++)
                // swap if currentKey is higher than next element in the right array
                if(inputArr[r]>inputArr[r+1]){
                    int temp=inputArr[r];
                    inputArr[r]=inputArr[r+1];
                    inputArr[r+1]=temp;
                }
    }
}
