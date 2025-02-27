package com.ssk.java.dsaprep.collections.priorityqueue;

import java.util.PriorityQueue;

public class MinHeapPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        pQ.add(10);
        pQ.add(20);
        pQ.add(15);

        // Above PriorityQueue is stored as following
        //       10
        //      /  \
        //    20    15

        System.out.println(pQ.peek());

        System.out.println(pQ.poll());

        // Post poll() PriorityQueue looks like
        //       15
        //      /
        //    20

        System.out.println(pQ.peek());
    }
}
