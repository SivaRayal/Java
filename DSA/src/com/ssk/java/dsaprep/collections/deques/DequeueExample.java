package com.ssk.java.dsaprep.collections.deques;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<Integer> que=new LinkedList<>();

        que.addFirst(1);
        que.addLast(2);
        que.addFirst(10);
        que.addLast(20);

        // using iterator
        Iterator<Integer> itASC=que.iterator();
        while(itASC.hasNext())
            System.out.print(itASC.next()+" | ");
        System.out.println();

        // using for loop
        for(int num:que)
            System.out.print(num+" | ");
        System.out.println();

        // using descending iterator
        Iterator<Integer> it=que.descendingIterator();
        while(it.hasNext())
            System.out.print(it.next()+" | ");
    }
}
