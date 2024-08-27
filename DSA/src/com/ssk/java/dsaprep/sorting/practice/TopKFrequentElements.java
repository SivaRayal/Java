package com.ssk.java.dsaprep.sorting.practice;

/*
    Top K Frequent Elements
		Given an integer array and a number k, find the k most frequent elements in the array.
		Example One
			{
			"arr": [1, 2, 3, 2, 4, 3, 1],
			"k": 2
			}
			Output:
			[3, 1]
		Example Two
			{
			"arr": [1, 2, 1, 2, 3, 1],
			"k": 1
			}
			Output:
			[1]

		Notes
			If multiple answers exist, return any.
			The order of numbers in the output array does not matter.

		Constraints:
			1 <= length of the given array <= 3 * 105
			0 <= array element <= 3 * 105
			1 <= k <= number of unique elements in the array
*/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] inpArr={1, 2, 3, 2, 4, 3, 1};
        int k=2;
        ArrayList<Integer> outputArr=new TopKFrequentElements().getKFrequentELements(inpArr,k);
        System.out.println(outputArr.toString());
    }

    public ArrayList<Integer> getKFrequentELements(int[] arr,int k){
        //intilize
        int[] countArr=new int[300001];
        for(int i=0;i<arr.length;i++)    countArr[arr[i]]++;

        ArrayList<Integer> outArr=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>((s1,s2)->s2.frequency-s1.frequency);
        for(int i=0;i<countArr.length;i++)
            if(countArr[i]>0)   pq.offer(new Pair(i,countArr[i]));

        // copy out
        for (int i=0;i<k;i++)
            outArr.add(pq.poll().value);

        return outArr;
    }
}

class Pair{
    int value;
    int frequency;

    Pair(int value,int frequency){
        this.value=value;
        this.frequency=frequency;
    }
}