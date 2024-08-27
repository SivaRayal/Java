package com.ssk.java.dsaprep.sorting.practice;

/*
    Kth Largest In An Array
		Given an array of integers, find the k-th largest number in it.
		Example One
			{
			"numbers": [5, 1, 10, 3, 2],
			"k": 2
			}
			Output:
			5
		Example Two
			{
			"numbers": [4, 1, 2, 2, 3],
			"k": 4
			}
			Output:
			2

		Constraints:
			1 <= array size <= 3 * 105
			-109 <= array elements <= 109
			1 <= k <= array size
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class KLargestInArray {
    public static void main(String[] args) {
        int[] arr1={4, 6, 5, 2, 20, 21};
        int k=3;
        System.out.println(new KLargestInArray().getKLargest(arr1,k));
    }

    public int getKLargest(int[] arr,int k){
//        Arrays.sort(arr);
//        return arr[arr.length-k];

//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k+1);
//        for(int i:arr) {
//            maxHeap.add(i);
//            if (maxHeap.size() > k)
//                maxHeap.poll();
//        }
//        return maxHeap.peek();

        quickSort(arr,0,arr.length-1,arr.length-k);
        return arr[arr.length-k];
    }

    public void quickSort(int[] arr, int l, int r, int k){
        // base case
        if(l>=k) return;
        int pivot=lomotusPartition(arr,l,r);
        if(pivot==k) return;
        if(pivot>k) quickSort(arr,l,pivot-1,k);
        else quickSort(arr,pivot+1,r,k);
    }

    public int lomotusPartition(int[] arr,int l, int r){
        // initilize
        int  pivote=arr[l],pivotePos=l;
        //  swap(arr,rand,r);

        // smallest element before pivote
        for(int i=l+1;i<=r;i++)   if(arr[i]<pivote)   swap(arr,i,++pivotePos);

        // largest element after pivote
        swap(arr,pivotePos,l);

        // return pivoteposs
        return  pivotePos;
    }

    public void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
