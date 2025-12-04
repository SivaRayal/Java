package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before selection sort - "+ Arrays.toString(inputArr));
        new SelectionSort().selectionSort(inputArr);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    public void selectionSort(int[] inputArr){
        // start from 0 index in left sub array
        for(int l=0;l<inputArr.length-1;l++){
            // initilize minIndex
            int minIndex=l;
            // compare and find min index from right sub array for wach element of left subarray
            for(int r=l+1;r<inputArr.length;r++) if(inputArr[r]<inputArr[minIndex]) minIndex=r;

            // swap minIndex element from right subarray to left
            int temp=inputArr[minIndex];
            inputArr[minIndex]=inputArr[l];
            inputArr[l]=temp;
        }

    }
}
