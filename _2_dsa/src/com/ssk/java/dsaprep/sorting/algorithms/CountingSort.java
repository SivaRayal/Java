package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before counting sort - "+ Arrays.toString(inputArr));
        int[] outArr=new CountingSort().countingSort(inputArr);
        System.out.println("After sorting - "+ Arrays.toString(outArr));
    }

    public int[] countingSort(int[] arr){
        // initilize index
        int n=arr.length,m=0;
        for(int i=0;i<n;i++) m=Math.max(m,arr[i]);
        int[] countArr=new int[m+1];
        int[] outArr=new int[n];

        // create and update count arr
        for(int i=0;i<n;i++)    countArr[arr[i]]++;
        for(int i=1;i<=m;i++)    countArr[i]+=countArr[i-1];

        // Update out array with correct pos by sub from countArr
        for(int i=n-1;i>=0;i--){
            outArr[countArr[arr[i]]-1]=arr[i];
            countArr[arr[i]]--;
        }
        return outArr;
    }
}
