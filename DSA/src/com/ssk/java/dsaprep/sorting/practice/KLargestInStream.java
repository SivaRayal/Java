package com.ssk.java.dsaprep.sorting.practice;

/*
    Kth Largest In A Stream
		Given an initial list along with another list of numbers to be appended with the initial list and an integer k,
		return an array consisting of the k-th largest element after adding each element from the first list to the second list.
		Example
			{
			"k": 2,
			"initial_stream": [4, 6],
			"append_stream": [5, 2, 20]
			}
			Output:
			[5, 5, 6]
			Append	Stream	Sorted Stream	2nd largest
			5	[4, 6, 5]	[4, 5, 6]	5
			2	[4, 6, 5, 2]	[2, 4, 5, 6]	5
			20	[4, 6, 5, 2, 20]	[2, 4, 5, 6, 20]	6

		Notes
			The stream can contain duplicates.

		Constraints:
			1 <= length of both lists <= 105
			1 <= k <= length of initial list + 1
			0 <= any value in the list <= 109
*/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestInStream {
    public static void main(String[] args) {
        int[] arr1={4, 6}, arr2={5, 2, 20};
        int k=2;
        ArrayList<Integer> out =new KLargestInStream().getKLargestInStream(arr1,arr2,k);
        System.out.println(out.toString());
    }

    public ArrayList<Integer> getKLargestInStream(int[] arr1,int[] arr2,int k){
        // initilize
        PriorityQueue<Integer> minHeap=new PriorityQueue<>((a,b)->a-b);
        ArrayList<Integer> outList=new ArrayList<>();

        // add initial elements into minHeap of size k and remove min elements if heap size is >k
        for(int i:arr1){
                minHeap.offer(i);
                if(minHeap.size()>k)
                    minHeap.poll();
        }

        // add appended elements into above minHeap of size k and remove min elements if heap size is >k
        for(int i:arr2){
            minHeap.offer(i);
            if(minHeap.size()>k)
                minHeap.poll();
            // for every insert from append elements copy the kth element from minHeap to output
            outList.add(minHeap.peek());
        }
        return outList;
    }

}
