package com.ssk.java.dsaprep.recursion.practice;


/*
    Permute Array Of Unique Integers
        Given an array of unique numbers, return in any order all its permutations.

        Example
            {
            "arr": [1, 2, 3]
            }

        Output:
            [
            [1, 2, 3],
            [1, 3, 2],
            [2, 1, 3],
            [2, 3, 1],
            [3, 2, 1],
            [3, 1, 2]
            ]
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermuteIntArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size array to accept input :");
        int n=sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        System.out.println("Enter input array values :");
        for(int i=0;i<n;i++){
            input.add(sc.nextInt());
        }

        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        decimalstring_helper(input,0,output);
        System.out.println("Generated possible permutations:");
        System.out.println(output);

    }

    public static void decimalstring_helper(ArrayList<Integer> input,Integer indx,ArrayList<ArrayList<Integer>> output){

        // base case - leaf node
        if(indx==input.size()-1){
            output.add(new ArrayList<>(input));
            return;
        }

        //Recursive intermediate node
        // permutation for each blank will have more choices
        for(int i=indx;i<input.size();i++){
//            System.out.println("input -"+input+" i = "+i+" index = "+indx+" output - "+output);
            Collections.swap(input,i,indx); // swapping with left most to avoid scattering previous choice
            decimalstring_helper(input,indx+1,output);
            Collections.swap(input,i,indx);
        }
    }
}
