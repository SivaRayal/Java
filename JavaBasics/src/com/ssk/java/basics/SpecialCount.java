package com.ssk.java.basics;

/*
Given an arry A (may contain duplicates) of N elements and a positive integer K. The task is to count the number of elements which occurs exactly floor(N/K) times in the array.
Example 1:
        Input:
        5 2
        1 4 1 2 4
        1 1 2 4 4

        Output:
        2
        Explanation:
        In the given array, 1 and
        4 occurs floor(5/2) = 2
        times. So count is 2.

*/

import java.util.Arrays;
import java.util.Scanner;

public class SpecialCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size N of the list: ");
        int n = sc.nextInt();
        System.out.print("Enter K value: ");
        int k = sc.nextInt();
        int specialCount = (int)Math.floor(n/k);
        System.out.println("Enter list of element of N size: ");

        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        Arrays.sort(input);
        System.out.println(getSpecialCount(input,specialCount));
    }

    public static int getSpecialCount(int[] input,int specialCount){
        System.out.println("spcial Count - "+specialCount);
        int outSpecialCount=0;
        int currentElementCount =1;
        for(int i=0;i<input.length;i++){
            int currentElement = input[i];
            System.out.println("currentElement - "+currentElement);
            if((i+1<input.length) && currentElement==input[i+1]){
                currentElementCount++;
            }else{
                if(currentElementCount==specialCount){
                    outSpecialCount++;
                }
                currentElementCount =1;
            }
        }

        return outSpecialCount;
    }
}
