package com.ssk.java.dsaprep.recursion.practice;


/*
Generate All Subsets Of A Set
Generate ALL possible subsets of a given set. The set is given in the form of a string s containing distinct lowercase characters 'a' - 'z'.

Example
    {
    "s": "xy"
    }

Output:
    ["", "x", "y", "xy"]

Notes
    Any set is a subset of itself.
    Empty set is a subset of any set.
    Output contains ALL possible subsets of given string.
    Order of strings in the output does not matter. E.g. s = "a", arrays ["", "a"] and ["a", ""] both will be accepted.
    Order of characters in any subset must be same as in the input string. For s = "xy", array ["", "x", "y", "xy"] will be accepted, but ["", "x", "y", "yx"] will not be accepted.

Constraints:
    0 <= length of s <= 19
    s only contains distinct lowercase English letters.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetCombinationGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to generate possible combinations out of it:");
        String input=sc.next();

        ArrayList<String> output=new ArrayList<>();
        if(input==null){}
        else{
            subset_combination_helper(input,0,new StringBuilder(),output);
        }
        System.out.format("Possible subset combination for %s are: ",input);
        System.out.println(output);
    }

    // include - exclude Combinations approach
    public static void subset_combination_helper(String input,Integer index,StringBuilder partialSolution,ArrayList<String> output){
        if(index==input.length()){
            output.add(partialSolution.toString());
            return;
        }

        //exclude
        subset_combination_helper(input,index+1,partialSolution,output);

        //include
        partialSolution.append(input.charAt(index));
        subset_combination_helper(input,index+1,partialSolution,output);
        partialSolution.deleteCharAt(partialSolution.length()-1);
    }
}
