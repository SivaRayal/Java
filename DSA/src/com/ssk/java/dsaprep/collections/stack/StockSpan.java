package com.ssk.java.dsaprep.collections.stack;

/*
    Given prices of a Stock for N consecutive days, the task is to find the span for every day. The span of a stock for a day i is defined as the number of consecutive days before it with price less than the price on i-th day including the i-th day.
	Example:
	Input: prices[] = {13, 15, 12, 14, 16, 8, 6, 4, 10, 30}
    Output: 1, 2, 1, 2, 5, 1, 1, 1, 4, 10
*/

import java.util.ArrayDeque;

class StockSpan {
    public static void main(String[] args) {
        int[] input={60,10,20,40,35,38,50,70,65};
        new StockSpan().printStockSpan(input);
    }

    // initialize stack with first index 0 and set span as 1 for 1st element.
    // Starting from next element - push index of current element in stack
    // for new-high case - pop all the index - stack will be empty - span=i+1
    // for mid-low case - pop prev low Index  - stack will have new-high index - span=i-newHighIndex
    // for new-low case - nothing to pop as its new low - stack will have new-high index - span=i-newHighIndex.
    public void printStockSpan(int[] stckprices){
        ArrayDeque<Integer> spanStack = new ArrayDeque<>();
        spanStack.push(0);
        int span=1;
        System.out.print(span+" ");

        for(int i=1;i<stckprices.length;i++){
            while(!spanStack.isEmpty() && stckprices[spanStack.peek()]<=stckprices[i]){
                spanStack.pop();
            }

            span= spanStack.isEmpty()?i+1:(i-spanStack.peek());
            System.out.print(span+" ");
            spanStack.push(i);
        }
    }
}
