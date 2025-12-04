package com.ssk.java.dsaprep.backtracking.practice;

/*
    	N Queen Problem
		Given an integer n, find all possible ways to position n queens on an n×n chessboard so that no two queens attack each other. A queen in chess can move horizontally, vertically, or diagonally.
		Do solve the problem using recursion first even if you see some non-recursive approaches.

		Example One
		{
		"n": 4
		}
		Output:
			[
			["--q-",
			 "q---",
			 "---q",
			 "-q--"],

			["-q--",
			 "---q",
			 "q---",
			 "--q-"]
			]
			There are two distinct ways four queens can be positioned on a 4×4 chessboard without attacking each other. The positions may appear in the output in any order. So the same two positions in different order would be another correct output.

		Example Two
		{
		"n": 2
		}
		Output:
			[
			]
			No way to position two queens on a 2×2 chessboard without them attacking each other - so empty array.

		Notes
			The function must return a two-dimensional array of strings representing the arrangements. Size of the array must be m×n where m is the number of distinct arrangements.
			Each string must be n characters long, and the strings' characters may be either q (for a queen) or - (for an empty position on the chessboard). Valid arrangements may appear in the output in any order.

		Constraints:
			1 <= n <= 12
*/

import java.util.ArrayList;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        ArrayList<ArrayList<String>> output=new ArrayList<>();
        int[] slate=new int[n];
        for(int i=0;i<n;i++)
            slate[i]=i;
        nqueenHelper(slate,0,n,output);
        System.out.println(output);
    }

    public static void nqueenHelper(int[] slate, int index, int n, ArrayList<ArrayList<String>> output){
        // check for conflic ( position of queens )
        if(checkConflic(slate, index-1)) return;

        // base case
        if( index==n)
            output.add(convert(slate,n));

        // recursive case
        for(int i=index;i<n;i++){
            swap(slate,i,index);
            nqueenHelper(slate,index+1,n,output);
            swap(slate,i,index);
        }
    }

    public static void swap(int[] slate, int i, int index){
        int temp = slate[i];
        slate[i]=slate[index];
        slate[index]=temp;
    }

    public static boolean checkConflic(int[] slate, int prevQueenPosition){
        for(int i=0;i<prevQueenPosition;i++){
            if(slate[i]==slate[prevQueenPosition] || Math.abs(i-prevQueenPosition)==Math.abs(slate[i]-slate[prevQueenPosition]))    return true;
        }
        return false;
    }

    // convert slate into n queens positions list
    public static ArrayList<String> convert(int[] slate,int n){
        ArrayList<String> possibleOutcome=new ArrayList<>();
        StringBuilder sb  = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append("-");
        }
        for(int i=0;i<n;i++){
            sb.setCharAt(slate[i],'q');
            possibleOutcome.add(sb.toString());
            sb.setCharAt(slate[i],'-');
        }
        return possibleOutcome;
    }
}
