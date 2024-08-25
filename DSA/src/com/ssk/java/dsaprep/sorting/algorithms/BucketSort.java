package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class BucketSort {
    public static void main(String[] args) {
        // Preload Input
        float[] inputArr={0.3f,0.5f,0.9f,0.8f,0.1f,0.01f};
        System.out.println("Before bucketSort sort - "+ Arrays.toString(inputArr));
        new BucketSort().bucketSort(inputArr,inputArr.length);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    public void bucketSort(float[] arr,int n){
        // base case
        if(n<=0) return;

        // initilize buckets
        @SuppressWarnings(value = "unchecked")
        Vector<Float>[] buckets=new Vector[n];
        for(int i=0;i<n;i++)    buckets[i]=new Vector<Float>();

        // Add (unsorted) elements into distributed buckets
        for(int i=0;i<n;i++){
            float index=arr[i]*n;
            buckets[(int)index].add(arr[i]);
        }

        // sort individual buckets
        for(int i=0;i<n;i++)    Collections.sort(buckets[i]);

        // Concatinate all buckets into arr
        int index=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<buckets[i].size();j++)
                arr[index++]=buckets[i].get(j);

    }
}
