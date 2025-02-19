package com.ssk.java.dsaprep.collections.queues;

/*

	Problem: Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.

            Only following standard operations are allowed on queue.
            • enqueue(x) : Add an item x to rear of queue
            • dequeue() : Remove an item from front of queue
            • size() : Returns number of elements in queue.
            • front() : Finds front item.
            Examples:
            Input : Q = [10, 20, 30, 40, 50, 60,
            70, 80, 90, 100]
            k = 5
            Output : Q = [50, 40, 30, 20, 10, 60,
            70, 80, 90, 100]
*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReversFirstKElements {
    public static void main(String[] args) {
        int[] input={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int k=5;

        // push K elements to aux stack
        Deque<Integer> stack=new ArrayDeque<>();
        Queue<Integer> queue=new LinkedList<>();

        for(int i =0;i<input.length;i++){
            if(i<k)
                stack.push(input[i]);
            else
                queue.offer(input[i]);
        }

        // input all elements into queue
        while(!stack.isEmpty())
            queue.offer(stack.pop());

        // remove the last k elements to move first
        for(int i=0;i< queue.size()-k;i++)
            queue.offer(queue.remove());

        System.out.println(queue.toString());
    }
}
