package com.ssk.java.dsaprep.collections.queues;
/*

	Problem: Given an integer N, the task is to print the first N numbers in increasing order formed using digits 5 and 6.

            Example:
            Input: N = 10
            Output: 5, 6, 55, 56, 65, 66, 555, 556, 565, 566

            Input: N = 4
            Output: 5, 6, 55, 56

            Input: N = 2
            Output: 5, 6

*/

import java.util.LinkedList;
import java.util.Queue;

public class NcombinationNumbers {
    public static void main(String[] args) {
        int n=10;
        new NcombinationNumbers().getNCombinationNumbers(n);
    }

    public void getNCombinationNumbers(int n){
        Queue<String> auxList=new LinkedList<>();
        auxList.offer("5");
        auxList.offer("6");
        // iterate to print n number of required combinations
        for(int i=0;i<n;i++){
            String temp=auxList.poll();
            System.out.print(temp+" ");

            auxList.offer(temp+5);
            auxList.offer(temp+6);
        }
    }
}
