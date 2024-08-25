package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        // preloaded input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before radix sort - "+ Arrays.toString(inputArr));
        new RadixSort().radixSort(inputArr);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    // find max element and perform counting sort based on base digits of each element.
    public void radixSort(int[] arr){
        // find max element
        int m=0;
        for(int i=0;i<arr.length;i++)   m=Math.max(m,arr[i]);

        // Perform counting sort on each digit ( base - 1,10,100 ) pos of each element.
        for(int exp=1;m/exp>0;exp*=10){
            countingSort(arr,arr.length,exp);
        }
    }

    // counting sort based on exponent
    public void countingSort(int[] arr, int n, int exp){
        // countArr create ad update sum of current and prev
        int[] countArr=new int[10];
        int[] outArr=new int[n];

        for(int i=0;i<n;i++) countArr[(arr[i]/exp)%10]++;
        for(int i=1;i<10;i++) countArr[i]+=countArr[i-1];

        for(int i=n-1;i>=0;i--) {
            outArr[countArr[(arr[i]/exp)%10]-1]=arr[i];
            countArr[(arr[i]/exp)%10]--;
        }

        for(int i=0;i<n;i++)    arr[i]=outArr[i];
    }

}
