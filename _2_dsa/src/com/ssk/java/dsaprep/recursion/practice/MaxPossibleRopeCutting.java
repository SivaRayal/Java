package com.ssk.java.dsaprep.recursion.practice;

/*
    	Rope Cutting Problem
		Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B and C. The task is to maximizes the number of cuts in rope. If it is impossible to make cut then print the number else print -1.
		Examples:

			Input: N = 17, A = 10, B = 11, C = 3
			Output: 3
			Explanation: The maximum cut can be obtain after making 2 cut of length 3 and one cut of length 11.

			Input: N = 10, A = 9, B = 7, C = 11
			Output: -1
			Explanation: It is impossible to make any cut so output will be -1.
*/

public class MaxPossibleRopeCutting {
    public static void main(String[] args) {
        int n=17,a=10,b=11,c=3;
        int out=new MaxPossibleRopeCutting().getMaxPossibleCuts(n,a,b,c);
        System.out.println(out);
    }

    public int getMaxPossibleCuts(int n,int a,int b,int c){
        // base case
        if(n==0)
            return 0;
        if(n<=-1)
            return -1;

        // conditional recursive loop
        int res=Math.max(getMaxPossibleCuts(n-a,a,b,c),Math.max(getMaxPossibleCuts(n-b,a,b,c),getMaxPossibleCuts(n-c,a,b,c)));
        if(res==-1)
            return -1;
        return res+1;
    }
}
