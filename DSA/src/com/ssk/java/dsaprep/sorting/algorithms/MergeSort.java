package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before merge sort - "+ Arrays.toString(inputArr));
        new MergeSort().sort(inputArr,0,inputArr.length-1);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    // divide and conquer - First divide the input array to single index element using sort()
    public void sort(int[] arr,int l, int r){
        // base case
        if(l>=r) return;

        // initilize mid
        int mid=(l+r)/2;

        // recursively divide till we reach single index elements to start compare.
        sort(arr,l,mid);
        sort(arr,mid+1,r);

        // merge by comparing single index elements.
        merge(arr,l,mid,r);
    }

    // merge all the sort() divided elements
    public void merge(int[] arr, int l, int mid, int r){
        // initilize aux and index pos
        int[] aux = new int[r-l+1]; // +1 for mid
        int i=l,j=mid+1,k=0;

        // start from first index of left and right sub arrays
        while(i<=mid && j<=r)
            if(arr[i]<arr[j]) // copy smaller elements to aux from left and right subarrays
                aux[k++]=arr[i++];
            else
                aux[k++]=arr[j++];

        // copy all remaining elements of left sub array - if available
        while(i<=mid)
            aux[k++]=arr[i++];

        // copy all remaining elements of right sub array - if available
        while(j<=r)
            aux[k++]=arr[j++];

        // Copy final aux array into original arr with sorted and merged list
        for(int index=l;index<=r;index++)
            arr[index]=aux[index-l];
    }

}
