package com.ssk.java.dsaprep.collections.queues.priorityqueue;

/*
    Problem: Given cost of N items and a value sum. The task is to find the maximum number of items that can be purchased using the value sum.

	Example:
	Input: costs[] = {1, 12, 5, 111, 200}, sum = 10
	Output: 2

	Input: costs[] = {20, 10, 5, 30, 100}, sum = 35
    Output: 3
*/

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxItemPurchasable {
    public static void main(String[] args) {
        int[] priceArr={1, 12, 5, 111, 200};
        int targetSum=10;

        // we can solve this using min heap
        // for k elements decrement sum from minHeap elements and inrement counter

        new MaxItemPurchasable().getCount(priceArr, targetSum);
    }

    public void getCount(int[] price,int sum){
        PriorityQueue<Integer> pQ=new PriorityQueue<>(Arrays.stream(price).boxed().toList());
        int count=0;
       while(!pQ.isEmpty() && sum>=0 && pQ.peek()<=sum)
       {
           sum-=pQ.poll();
           count++;
       }
        System.out.println(count);
    }
}
