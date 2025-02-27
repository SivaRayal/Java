package com.ssk.java.dsaprep.collections.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        pQ.add(10);
        pQ.add(20);
        pQ.add(15);

        // Above PriorityQueue is stored as following
        //       20
        //      /  \
        //    10    15

        System.out.println(pQ.peek());
        System.out.println(pQ.poll());

        // Post poll() PriorityQueue looks like
        //       15
        //      /
        //    10
        System.out.println(pQ.peek());
    }
}
