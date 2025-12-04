package com.ssk.java.dsaprep.collections.map.treemap;

/*
	Sample Problem: Given an array arr of integers of size N, the task is to find, for every element, the number of elements that are greater than it.
	Examples:
        Input: arr[] = {4, 6, 2, 1, 8, 7}
        Output: {3, 2, 4, 5, 0, 1}
            For 4, there are 3 greater elements: 6, 8, 7
            For 6, there are 2 greater elements:  8, 7
            For 2, there are 4 greater elements: 4, 6, 8, 7
            For 1, there are 5 greater elements: 4, 6, 2, 8, 7
            For 8, there are 0 greater elemenet.
            For 7, there is 1 greater element: 8
*/

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FindGreaterRank {
    public static void main(String[] args) {
        int inp[]={4, 6, 2, 1, 8, 7};

        TreeMap<Integer,Integer> tmap=new TreeMap<>(Collections.reverseOrder());
        // calculate freq
        for(int i=0;i<inp.length;i++)
            tmap.put(inp[i],tmap.getOrDefault(inp[i],0)+1);

        // calculate cummFreq
        int cummFreq=0;
        for(Map.Entry<Integer,Integer> s:tmap.entrySet()){
            int temp= s.getValue();
            tmap.put(s.getKey(),cummFreq);
            cummFreq+=temp;
        }

        // display out
        for(int i=0;i<inp.length;i++)
            System.out.println(tmap.get(inp[i]));
    }
}
