package com.ssk.java.code365;

/*
Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.

Problem Constraints
1 <= |A| <= 106
        1 <= Ai <= 109

Input Format
The first argument is an integer array A.

Output Format
Return the majority element.

Example Input
A = [2, 1, 2]

Example Output
2

Example Explanation
2 occurs 2 times which is greater than 3/2.


Algorithm
    Sort array
    initilize maxElementCount=1, maxCount=0, maxElement=A[0], size=a.length, majority=size/2
    for 1 to n:
        if A[prevIndex] == A[currentIndex] :
            maxElementCount++;
            maxElement=getMaxElement(maxCount,maxElementCount,majority,A[i]);
        else
            maxElement=getMaxElement(maxCount,maxElementCount,majority,A[i-1]);
            initilize maxElementCount=1;
    return maxElement;

    getMaxElement():
        if(maxCount < maxElementCount && majority < maxElementCount)
            swap maxCount = maxElementCount;
            maxElement = max;
         return maxElement;
*/

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] A={100};
        int out=majorityElementFinder(A);
        System.out.println(out);
    }

    static int majorityElementFinder(int[] A){
        int size=A.length;
        if(size==1){
            return A[0];
        }
        Arrays.sort(A);
        int maxElementCounter=1,maxCount=0,maxElement=A[0],majority=size/2;

        for(int i=1;i<size;i++){
            if(A[i-1]==A[i]){
                maxElementCounter++;
                maxElement=getMaxElement(maxCount,maxElementCounter,majority,A[i],maxElement);
            }else{
                maxElement=getMaxElement(maxCount,maxElementCounter,majority,A[i-1],maxElement);
                maxElementCounter=1;
            }
        }
        return maxElement;

    }

    static int getMaxElement(int maxCount,int maxElementCount,int majority,int max,int maxElement){
        if((maxCount < maxElementCount) && (majority < maxElementCount)){
            maxCount = maxElementCount;
            maxElement = max;
        }
        return maxElement;
    }
}
