package com.ssk.java.dsaprep.collections.arraydequeue;

/*
    	Problem: Given an array and an integer K, find the maximum for each and every contiguous subarray of size k.

        Examples :
        Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
        Output: 3 3 4 5 5 5 6
*/

import java.util.Deque;
import java.util.LinkedList;

public class MaxInSubArrayOfKsize {
    public static void main(String[] args) {
        int[] input={1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k=3;

        new MaxInSubArrayOfKsize().slidingWindow(input,k);
        // using array dequeue methods to hold max element of k size subarray
        // add max of first k elements to arrayDeque remove all min elements at each iteration
        // iterate from k to remaining elements of the input at each iteration -
            // * print max element / first element of the queue
            // * remove the max element / first element of queu if falling out side of the window ( i-k index  )
            // * add max of next k elements to addayDeque remove all min elements at each iteration.
    }

    public void slidingWindow(int[] inp,int k){
        Deque<Integer> que=new LinkedList<>();
        int i;
        // first k elements window
        for(i=0;i<k;++i){
            // remove old element from window if not usefull
            while(!que.isEmpty() && inp[que.peekLast()]<=inp[i])
                que.removeLast();

            // add next element to window
            que.addLast(i);
        }

        // next n-k elements - slide window
        for(;i<inp.length;++i){
            // print element in que
            System.out.print(inp[que.peekFirst()]+" ");

            // check if i-element is out of k-window : i-k
            while(!que.isEmpty() && que.peekFirst()<=i-k)
                que.pop();

            // remove  old elements from window if not useful
            while(!que.isEmpty() && inp[que.peekLast()]<=inp[i])
                que.removeLast();

            // add new element to window
            que.addLast(i);
        }

        // print max element for last window
        System.out.print(inp[que.peekLast()]);
    }
}
