package com.ssk.java.dsaprep.collections.map.hashmap;

/*
    Problem: Given an array that may contain duplicates, print all elements, and their frequencies.
	Note: Order of elements in output doesn't matter.
	Examples:
        Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
        Output :
            10 3
            20 4
            5  1
*/

import java.util.HashMap;
import java.util.Map;

public class FrequencyMapper {
    public static void main(String[] args) {
        int[] inp={10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<inp.length;i++){
            map.put(inp[i],map.getOrDefault(inp[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> mapEntry:map.entrySet())
            System.out.println(mapEntry.getKey() + " " +mapEntry.getValue());
    }
}
