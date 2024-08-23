package com.ssk.java.dsaprep.sorting.practice;


import java.util.ArrayList;
import java.util.Arrays;

/*
       2 Sum In A Sorted Array
        Given an array sorted in non-decreasing order and a target number, find the indices of the two values from the array that sum up to the given target number.
        Example
        {
        "numbers": [1, 2, 3, 5, 10],
        "target": 7
        }
        Output:
        [1, 3]
        Sum of the elements at index 1 and 3 is 7.

        Notes
        In case when no answer exists, return an array of size two with both values equal to -1, i.e., [-1, -1].
        In case when multiple answers exist, you may return any of them.
        The order of the indices returned does not matter.
        A single index cannot be used twice.

        Constraints:
        2 <= array size <= 105
        -105 <= array elements <= 105
        -105 <= target number <= 105
        Array can contain duplicate elements.
 */
public class TwoSumSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>(Arrays.asList(1, 2, 3, 5, 10));
        Integer target=7;
        ArrayList<Integer> output=new TwoSumSortedArray().getPairedSumArray(input,target);
        System.out.println(output.toString());
    }


    // Using 2 pointer algo.
    //    initilize l=0, r=numbers.size()-1;
    //    while(l<r)
    //        if(targer < num[l]+num{r}) l++;
    //        else if(target > num[l]+num{r}) r--;
    //        else return l,r;

    public ArrayList<Integer> getPairedSumArray(ArrayList<Integer> input,Integer target){
        int l=0,r=input.size()-1;
        while(l<r){
            int targetSum=input.get(l)+input.get(r);
            if(targetSum<target) l++;
            else if(targetSum>target) r--;
            else {
                return new ArrayList<>(Arrays.asList(l,r));
            }
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }
}
