package com.ssk.java.dsaprep.collections.priorityqueue;

/*
    Problem: Write an efficient program for printing K largest elements in an array. Elements in array can be in any order.

	Example:
	Input: arr[] = [1, 23, 12, 9, 30, 2, 50],  K = 3
    Output: 50, 30 and 23.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElementsInArray {
    public static void main(String[] args) {
        int[] input={1, 23, 12, 9, 30, 2, 50};
        int k=3;

        new KLargestElementsInArray().printKLargestElementsMinHeap(input,k);
        new KLargestElementsInArray().printKLargestElementsMaxHeap(input,k);
    }

    public void printKLargestElementsMinHeap(int[] inp,int k){
        PriorityQueue<Integer> pQ=new PriorityQueue<>();
        int i;
        for(i=0;i<k;i++)
            pQ.add(inp[i]);

        for(;i<inp.length;++i){
            if(pQ.peek()<=inp[i]){
                pQ.poll();
                pQ.add(inp[i]);
            }
        }

        for(int j=0;j<k;j++)
            System.out.print(pQ.poll()+" ");

        System.out.println();
    }

    public void printKLargestElementsMaxHeap( int[] inp,int k){
        PriorityQueue<Integer> pQ=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<inp.length;i++)
            pQ.add(inp[i]);

        for(int i=0;i<k;i++)
            System.out.print(pQ.poll()+" ");

    }
}
