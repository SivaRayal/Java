package com.ssk.java.dsaprep.collections.set.hashset;

/*
    Problem: Check whether any pair's sum in an array matches to the given 'sum'. Return true or 1 if a match is found else return false or 0
	Examples:
        Input: arr[] = {5, 9, 8, 13, 2, 4}, sum = 7
        Output: True
        Explanation: 5 + 2 = 7
*/

import java.util.HashSet;
import java.util.Set;

public class SumFinder {
    public static void main(String[] args) {
        int arr[] = {5, 9, 8, 13, 2, 4}, sum = 7;
        Set<Integer> s=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(s.contains(sum-arr[i])==true){
                System.out.println(Boolean.TRUE);
                break;
            }
            s.add(arr[i]);
        }
    }
}
