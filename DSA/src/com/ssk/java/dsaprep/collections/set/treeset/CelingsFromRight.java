package com.ssk.java.dsaprep.collections.set.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
    Sample Problem: Given an array of integers, find the ceiling of every element on the right. That is the closest greater or equal element for every element on right. If there is no such element then print -1
	Examples:
        Input : arr[] = {10, 5, 11, 10, 20, 12}
        Output :         10 10 12 12 -1 -1
*/


public class CelingsFromRight {
    public static void main(String[] args) {
        int[] arr={10, 5, 11, 10, 20, 12};
        TreeSet<Integer> numSet=new TreeSet<>();
        List<Integer> ceilings=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            if(numSet.ceiling(arr[i])==null)
                ceilings.add(-1);
            else
                ceilings.add(numSet.ceiling(arr[i]));
            numSet.add(arr[i]);
        }
        for(int i=ceilings.size()-1;i>=0;i--)
            System.out.println(ceilings.get(i));
    }
}
