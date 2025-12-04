package com.ssk.java.dsaprep.sorting.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

/*
2 Sum In An Array
        Given an array and a target number, find the indices of the two values from the array that sum up to the given target number.
        Example One
        {
        "numbers": [5, 3, 10, 45, 1],
        "target": 6
        }
        Output:
        [0, 4]
        Sum of the elements at index 0 and 4 is 6.

        Example Two
        {
        "numbers": [4, 1, 5, 0, -1],
        "target": 10
        }
        Output:
        [-1, -1]

        Notes
        The function returns an array of size two where the two elements specify the input array indices whose values sum up to the given target number.
        In case when no answer exists, return an array of size two with both values equal to -1, i.e., [-1, -1].
        In case when multiple answers exist, you may return any of them.
        The order of the returned indices does not matter.
        A single index cannot be used twice.

        Constraints:
        2 <= array size <= 105
        -105 <= array elements <= 105
        -105 <= target number <= 105
        Array can contain duplicate elements.
*/
public class TwoSumUnSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>(Arrays.asList(2, 1, 3, 10, 5));
        Integer target=7;
        ArrayList<Integer> output=new TwoSumUnSortedArray().getPairedSumArray(input,target);
        System.out.println(output.toString());
    }

    // using hashtable to store elements as index and input indexs as values of hashtable.
    public ArrayList<Integer> getPairedSumArray(ArrayList<Integer> input, Integer target){
        Hashtable<Integer,Integer> ht=new Hashtable<>(input.size());
        for(int i=0;i<input.size();i++){
            if(ht.containsKey(target-input.get(i)))
                return new ArrayList<>(Arrays.asList(ht.get(target-input.get(i)),i));
            else
                ht.put(input.get(i),i);
        }
        return new ArrayList<>(List.of(-1,-1));
    }
}
