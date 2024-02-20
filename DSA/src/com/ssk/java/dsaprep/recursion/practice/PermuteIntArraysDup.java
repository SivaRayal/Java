package com.ssk.java.dsaprep.recursion.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;



/*
Given a collection of number that might contain duplicates, return all possible unique permutations.
	Eg:
		input = [1,1,2]
		Output :
			[
				[1,1,2],
				[1,2,1],
				[2,1,1]
			]
*/
public class PermuteIntArraysDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size(n) of input : ");
        int n= sc.nextInt();
        ArrayList<Integer> input=new ArrayList<>(n);
        System.out.format("Enter inputs for %s size list :",n);
        for(int i=0;i<n;i++){
            input.add(sc.nextInt());
        }

        System.out.println("Input - "+input);
        ArrayList<ArrayList<Integer>> output= new ArrayList<>();
        ds_dup_norep(input,0,output);
        System.out.println("Generated permutation for input with duplicates and no repetitions are - "+output);
    }

    public static void ds_dup_norep(ArrayList<Integer> input,Integer indx, ArrayList<ArrayList<Integer>> output){
        // base case
        if(indx==input.size()-1){
            output.add(new ArrayList<>(input));
            return;
        }

        // Recursive case
        HashSet<Integer> hSet = new HashSet<>(); // using set to skip duplicate choices
        for(int i=indx;i<input.size();i++){
            if(hSet.contains(input.get(i))){
                continue;
            } else{
                hSet.add(input.get(i));
                // swap like in merge sort
                Collections.swap(input,i,indx); // swapping to avoid scattering previous choices partial sol.
                ds_dup_norep(input,indx+1,output);
                Collections.swap(input,i,indx);
            }

        }

    }
}
