package com.ssk.java.dsaprep.collections.set.linkedhashset;

/*
	Problem: Given an array of integers, find and print all those elements of an array which are repeated.
        Input: arr[] = {10, 8, 10, 7, 7, 6}
        Output: {10, 7}

*/

import java.util.LinkedHashSet;
import java.util.Set;

public class RepetedSet {
    public static void main(String[] args) {
        int arr[] = {10, 8, 10, 7, 7, 6};
        Set<Integer> out=new LinkedHashSet<>();
        Set<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            if(s.contains(arr[i])==true){
                out.add(arr[i]);
                continue;
            }
            s.add(arr[i]);
        }
        System.out.println(out);
    }
}
