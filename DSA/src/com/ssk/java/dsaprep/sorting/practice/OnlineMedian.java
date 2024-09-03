package com.ssk.java.dsaprep.sorting.practice;

/*
    Online Median
		Given a list of numbers, the task is to insert these numbers into a stream and find the median of the stream after each insertion. If the median is a non-integer, consider it’s floor value.
		The median of a sorted array is defined as the middle element when the number of elements is odd and the mean of the middle two elements when the number of elements is even.
		Example
			{
			"stream": [3, 8, 5, 2]
			}
			Output:
			[3, 5, 5, 4]
			Iteration	Stream	Sorted Stream	Median
			1	[3]	[3]	3
			2	[3, 8]	[3, 8]	(3 + 8) / 2 => 5
			3	[3, 8, 5]	[3, 5, 8]	5
			4	[3, 8, 5, 2]	[2, 3, 5, 8]	(3 + 5) / 2 => 4

		Constraints:
			1 <= length of stream <= 105
			1 <= any value in the stream <= 105
			The stream can contain duplicates.
*/

import java.util.*;

public class OnlineMedian {
    public static void main(String[] args) {
        List<Integer> input= Arrays.asList(3, 8, 5, 2);
        System.out.println(new OnlineMedian().getMedianList(input).toString());
    }
    public ArrayList<Integer> getMedianList(List<Integer> input){
        // initilize
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> output=new ArrayList<>(input.size());

        for(Integer i:input){
            // insert into maxHeap(firstHald) & minHeap(sencondHalf of input with min value at head).
            insert(i,minHeap,maxHeap);
            // Rebalance minHaeap and MaxHeap
            balance(minHeap,maxHeap);
            // find the meadian at each insert and update output
            output.add(getMedian(minHeap,maxHeap));
        }

        return output;
    }

    public void insert(Integer i,PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap){
        if(maxHeap.isEmpty() || maxHeap.peek()>=i)
            maxHeap.offer(i);
        else
            minHeap.offer(i);
    }

    public void balance(PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap){
        if(maxHeap.size()>minHeap.size()+1)
            minHeap.offer(maxHeap.poll());
        else if(maxHeap.size()<minHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public Integer getMedian(PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap){
        if(minHeap.size()==maxHeap.size())
            return (maxHeap.peek()+minHeap.peek())/2;
        else
            return maxHeap.peek();
    }
}
