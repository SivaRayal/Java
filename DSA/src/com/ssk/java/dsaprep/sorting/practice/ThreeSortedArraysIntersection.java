package com.ssk.java.dsaprep.sorting.practice;

/*
    Intersection Of Three Sorted Arrays
		Given three arrays sorted in the ascending order, return their intersection sorted array in the ascending order.
		Example One
			{
			"arr1": [2, 5, 10],
			"arr2": [2, 3, 4, 10],
			"arr3": [2, 4, 10]
			}
			Output:
			[2, 10]
		Example Two
			{
			"arr1": [1, 2, 3],
			"arr2": [],
			"arr3": [2, 2]
			}
			Output:
			[-1]
		Example Three
			{
			"arr1": [1, 2, 2, 2, 9],
			"arr2": [1, 1, 2, 2],
			"arr3": [1, 1, 1, 2, 2, 2]
			}
			Output:
			[1, 2, 2]

		Notes
			If the intersection is empty, return an array with one element -1.

		Constraints:
			0 <= length of each given array <= 105
			0 <= any value in a given array <= 2 * 106
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSortedArraysIntersection {
    public static void main(String[] args) {
        int[] arr1={2, 5, 10},arr2={2, 3, 4, 10},arr3={2, 4, 10};
        System.out.println(new ThreeSortedArraysIntersection().getIntersection(arr1,arr2,arr3).toString());
    }

    public ArrayList<Integer> getIntersection(int[] arr1, int[] arr2, int[] arr3){
        //initialize
        ArrayList<Integer> outArr=new ArrayList<>();
        int p1=0,p2=0,p3=0;

        while(p1<arr1.length && p2<arr2.length && p3<arr3.length){
            if(arr1[p1]==arr2[p2] && arr1[p1]==arr3[p3])
            {
                outArr.add(arr1[p1]);
                p1++; p2++; p3++;
            }
            else{
                int min=Math.min(arr1[p1],Math.min(arr2[p2],arr3[p3]));
                if(arr1[p1]==min)   p1++;
                else if(arr2[p2]==min)  p2++;
                else p3++;
            }
        }
        if(outArr.size()<=0)
            outArr.add(-1);
        return outArr;
    }
}
