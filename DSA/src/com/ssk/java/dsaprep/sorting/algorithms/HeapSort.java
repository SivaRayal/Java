package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before Heap sort - "+ Arrays.toString(inputArr));
        new HeapSort().heapSort(inputArr,inputArr.length);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    // construct heapify
    // Build Maxheap
    // extract one by one from the heap
    public void heapSort(int[] arr, int n){
        // build MaxHeap
        for(int i=n/2-1;i>=0;i--)    heapify(arr, n, i);

        // extract one by one from heap
        for(int i=n-1;i>=0;i--){
            swap(arr,i,0);
            heapify(arr,i,0);
        }
    }


    // heapify function
    public void heapify(int[] arr, int n, int i){
        // initilize
        int largest=i,left=2*i+1, right=2*i+2;
        if(left<n && arr[left]> arr[largest]) largest=left;
        if(right<n && arr[right]>arr[largest]) largest=right;
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }

    // swap util function
    public void swap(int[] arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
