package com.ssk.java.dsaprep.recursion.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Given a collection of integers  that might contain duplicates, nums, return all possible subsets ( the power set ).
NOTE - The solution  set must not contain duplicate subsets
	Eg:
		input = [1,2,2]
		Output =
			[
				[2],
				[1],
				[1,2,2],
				[2,1],
				[1,2],
				[]
			]

*/
public class SubsetDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size(n) of input to accept: ");
        Integer n = sc.nextInt();
        ArrayList<Integer> input=new ArrayList<>(n);
        System.out.println("Enter input elements :");
        for(int i=0;i<n;i++){
            input.add(sc.nextInt());
        }
        //sort input to group duplicates in order
        Collections.sort(input);
        ArrayList<ArrayList<Integer>> output=new ArrayList<>();
        subset_dup_helper(input,0,new ArrayList<Integer>(),output);
        System.out.println("Possible subset combinations for provided input are :");
        System.out.println(output);
    }

    public static void subset_dup_helper(ArrayList<Integer> input,Integer index,ArrayList<Integer> aux,ArrayList<ArrayList<Integer>> output){
        // base case
        if(index == input.size()){
            output.add(new ArrayList<>(aux));
            return;
        }

        // Recursive case
        // find count from sorted group to consider duplicate count
        Integer count=0;
        for(int i=index;i<input.size();i++){
            if(input.get(i)==input.get(index))
                count++;
            else
                break;
        }

        // exclusion case - bipass duplicates using index+count
        subset_dup_helper(input,index+count,aux,output);

        // multiway inclusions
        for(int i=0;i<count;i++){
            aux.add(input.get(index));
            subset_dup_helper(input,index+count,aux,output);
        }

        // remove multiway incusions
        for(int i=0;i<count;i++){
            aux.remove(aux.size()-1);
        }
    }
}
