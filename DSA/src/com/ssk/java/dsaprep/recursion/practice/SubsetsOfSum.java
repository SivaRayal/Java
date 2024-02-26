package com.ssk.java.dsaprep.recursion.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Given a collection of candidate numbers ( candidates and target number (target), find all unique combinations in candidates which  candidate numbers sums to rarget.
Each number in candidates may only be used once in the combination
NOTE:
	All numbers (including target) will be positive integers
	The solution set must not contain duplicate combinations
	Eg:1
		Input - Candidates - [10,1,2,7,6,1,5], target=8,
		A solution set is :
		[
			[1,7],
			[1,2,5],
			[2,6],
			[1,1,6]
		]
*/
public class SubsetsOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input size(n): ");
        Integer n = sc.nextInt();
        System.out.println("Enter input elements :");
        ArrayList<Integer> input=new ArrayList<>();
        for(int i=0;i<n;i++){
            input.add(sc.nextInt());
        }
        Collections.sort(input);
        System.out.println("Enter sum of subset size(k): ");
        Integer k= sc.nextInt();

        ArrayList<ArrayList<Integer>> output=new ArrayList<>();
        subset_size_helper(input,k,0,new ArrayList<Integer>(),output);
        System.out.format("Generated subset of %s sum are :",k);
        System.out.println(output);
    }

    public static void subset_size_helper(ArrayList<Integer> input,Integer k,Integer index,ArrayList<Integer> aux,ArrayList<ArrayList<Integer>> output){
        // backtracking case
        if(aux.stream().mapToInt(Integer::intValue).sum()==k){
            output.add(new ArrayList<>(aux));
            return;
        }

        //base case
        if(index==input.size()){
            return;
        }

        Integer count=0;
        for(int i=index;i<input.size();i++){
            if(input.get(i)==input.get(index))
                count++;
            else
                break;
        }

        // exclude
        subset_size_helper(input,k,index+count,aux,output);

        // include
        for(int i=0;i<count;i++){
            aux.add(input.get(index));
            subset_size_helper(input,k,index+count,aux,output);
        }
        for(int i=0;i<count;i++) {
            aux.remove(aux.size() - 1);
        }
    }
}
