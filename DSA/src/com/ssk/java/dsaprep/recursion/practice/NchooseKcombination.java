package com.ssk.java.dsaprep.recursion.practice;


import java.util.ArrayList;
import java.util.Scanner;

/*
Given two integers n and k, find all the possible unique combinations of k numbers in range 1 to n.
Example One
    {
        "n": 5,
        "k": 2
    }

 Output:
    [
        [1, 2],
        [1, 3],
        [1, 4],
        [1, 5],
        [2, 3],
        [2, 4],
        [2, 5],
        [3, 4],
        [3, 5],
        [4, 5]
    ]
*/
public class NchooseKcombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size(n) - ");
        int n=sc.nextInt();
        System.out.println();
        System.out.print("Enter subset size(k) - ");
        int k=sc.nextInt();
        System.out.println();
        System.out.format("Possible subset of size %s in list of size %s are :", k, n);

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        nChooseKcombination_helper(1,n,k,new ArrayList<>(),result);
        System.out.println(result);

    }

    public static void nChooseKcombination_helper(Integer currentNum, Integer n, Integer k, ArrayList<Integer> bucket, ArrayList<ArrayList<Integer>> result){
        // if subset is of size k then add the subset to result
        if(bucket.size()==k){
            result.add(new ArrayList<>(bucket));
            return;
        }

        // base case - if current number is moving out of the input list size(n)
        if(currentNum==n+1){
            return;
        }

        // exclude case where we move down the exclusion choice list.
        nChooseKcombination_helper(currentNum+1,n,k,bucket,result);
        
        // include case where we move up to previous inclusion choice, so perform add and remove.
        bucket.add(currentNum); // Include to subset
        nChooseKcombination_helper(currentNum+1,n,k,bucket,result);
        bucket.remove(bucket.size()-1); // exclude from subset
    }
}
