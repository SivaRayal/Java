package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={1, 1, 1, 3, 5, 4, 6};
        System.out.println("Before selection sort - "+ Arrays.toString(inputArr));
        new QuickSort().quickSort(inputArr,0,inputArr.length-1);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    public void quickSort(int[] arr, int l, int r){
        // base case
        if(l>=r) return;

//        int pivote=naivePartition(arr, l, r);
//        quickSort(arr,l,pivote);
//        quickSort(arr,pivote+1,r);

        int pivote=lomutoPartition(arr, l, r);
        quickSort(arr,l,pivote-1);
        quickSort(arr,pivote+1,r);

//        int pivote=hoares(arr, l, r);
//        quickSort(arr,l,pivote);
//        quickSort(arr,pivote+1,r);

    }

    // Naive Partition
    public int naivePartition(int[] arr, int l, int r){
        // initilize
        int[] aux=new int[r-l+1];
        int pivot=arr[r],k=0;

        // copy small elements to aux befor pivot
        for(int i=l;i<=r;i++) if(arr[i]<pivot) aux[k++]=arr[i];

        // copy pivot pos and value into aux
        int pivotPos=k;
        aux[k++]=pivot;

        // copy higher elements to aux after pivot
        for(int i=l;i<=r;i++) if(arr[i]>pivot) aux[k++]=arr[i];

        // copy aux into original arr
        for(int i=l;i<=r;i++)   arr[i]=aux[i-l];

        return pivotPos;
    }

    // lomuto parition
    public int lomutoPartition(int[] arr, int l, int r){
        // initilize
        int pivote=arr[l] , pivoPost=l;

        // Swap smaller elements before pivot
        for(int i=l+1;i<=r;i++) if(arr[i]<pivote) swap(arr,++pivoPost,i);

        // Swap higher element after pivot pos.
        swap(arr,pivoPost,l);

        // Return saved pivote position
        return pivoPost;
    }


    // Hoares partition
    public int hoares(int[] arr, int l, int r){
        // intitialize
        int pivote=arr[l] , i=l-1, j=r+1;

        // increment and decrement left and right pointer for smaller and higher elements.
        while(true){
            do  i++;    while(arr[i]<pivote);
            do  j--;    while(arr[j]>pivote);

            if(i>=j)    return j; // return when left and right pointer crossovers
            swap(arr,i,j); // swap lower and higher elements before and after pivote.
        }
    }

    // common swap function
    public void swap(int[] arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

}
