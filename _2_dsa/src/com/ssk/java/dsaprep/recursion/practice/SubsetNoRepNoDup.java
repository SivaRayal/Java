package com.ssk.java.dsaprep.recursion.practice;


import java.util.ArrayList;
import java.util.Scanner;

/*
Given a set of distinct integers, nums, return all possible subsets ( the power set).
Note - The solution set must not contain duplicable subsets.
    Eg:
	    input = [1,2,3]
	    output =
			[
				[3],
				[1],
				[2],
				[1,2,3],
				[1,3],
				[2,3],
				[1,2],
				[]
			]
*/
public class SubsetNoRepNoDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size(n) of input to accept: ");
        Integer n = sc.nextInt();
        ArrayList<Integer> input=new ArrayList<>(n);
        System.out.println("Enter input elements :");
        for(int i=0;i<n;i++){
            input.add(sc.nextInt());
        }

        ArrayList<ArrayList<Integer>> output=new ArrayList<>();
        subset_helper(input,0,new ArrayList<Integer>(),output);
        System.out.println("Possible subset combinations for provided input are :");
        System.out.println(output);

    }

    public static void subset_helper(ArrayList<Integer> input,Integer index,ArrayList<Integer> aux,ArrayList<ArrayList<Integer>> output){
        //basecase
        if(index==input.size()){
            output.add(new ArrayList<>(aux));
            return;
        }

        // exclusion case
        subset_helper(input,index+1,aux,output);

        //inclusion case
        aux.add(input.get(index));
        subset_helper(input,index+1,aux,output);
        aux.remove(aux.size()-1);
    }
}
