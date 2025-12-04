package com.ssk.java.dsaprep.recursion.practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
Generate Binary Strings Of Length N
Given a number n, generate all possible binary strings of length n.

Example
    {
    "n": 3
    }

Output:
    ["000", "001", "010", "011", "100", "101", "110", "111"]
*/

public class BinaryStringGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of binary String to generate :");
        int n=sc.nextInt();

        ArrayList<String> output=new ArrayList<>();
        binarystring_helper(n,"",output);
        System.out.println("Binary strings generated :");
        System.out.println(output);
    }

    // divide and conquer left-to-right - DFS
    public static void binarystring_helper(Integer n,String slate,ArrayList<String> output){
        if(n==0){
            output.add(slate);
        }
        else{
            binarystring_helper(n-1,slate+"0",output);
            binarystring_helper(n-1,slate+"1",output);
        }
    }
}
