package com.ssk.java.dsaprep.collections.set.hashset;

/*
    Problem: Given an unsorted integer array, print all distinct elements in an array. The given array may contain duplicates and the output should print every element only once.
        Input: arr[] = {4, 8, 5, 8, 7, 5}
        Output: {4, 8, 5, 7}
*/

import java.util.HashSet;
import java.util.Set;

public class UniqueSet {
    public static void main(String[] args) {
        int arr[]={4, 8, 5, 8, 7, 5};

        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);
    }
}
