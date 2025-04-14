package com.ssk.java.dsaprep.arrays;

/*
    		Problem #1 : Range Sum Queries using Prefix Sum
			Description : We are given an Array of n integers, We are given q queries having indices l and r . We have to find out sum between the given range of indices.
				Input
                    [4, 5, 3, 2, 5] // inp arr
                    3 // q - queries
                    0 3 // l,r
                    2 4 // l,r
                    1 3 // l,r
				Output
                    14 (4+5+3+2)
                    10 (3+2+5)
                    10 (5+3+2)
*/

public class RangeSumQueries {

    public static void main(String[] args) {
        int inp[] = {4, 5, 3, 2, 5};
        int q = 3;

        // create PrefixSum array
        int prefixSum[]=new int[inp.length];
        prefixSum[0]=inp[0];
        for(int i=1;i<inp.length;i++){
            prefixSum[i]=inp[i]+prefixSum[i-1];
        }

        // queries output
        System.out.println(new RangeSumQueries().getPrefixSum(prefixSum,0,3));
        System.out.println(new RangeSumQueries().getPrefixSum(prefixSum,2,4));
        System.out.println(new RangeSumQueries().getPrefixSum(prefixSum,1,3));
    }


    public Integer getPrefixSum(int[] prefixSum, int l, int r){
        if(l==0){
            return prefixSum[r];
        }else {
            return prefixSum[r]-prefixSum[l-1];
        }
    }
}
