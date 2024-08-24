package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before insertion sort - "+Arrays.toString(inputArr));
        new InsertionSort().insertionSort(inputArr);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    public void insertionSort(int[] inputArr){
        // start from index=1 ( right sub arr )
        for(int i=0;i<inputArr.length;i++){
            // initilize leftsubarray max index and currentKey
            int j=i-1, currentKey=inputArr[i];
            // shift higher elements from left to right based on currentKey
            while(j>=0 && currentKey < inputArr[j]){
                inputArr[j+1]=inputArr[j--];
            }
            // fix smaller element to correctposition in left sub array..
            inputArr[j+1]=currentKey;
        }
    }
}
