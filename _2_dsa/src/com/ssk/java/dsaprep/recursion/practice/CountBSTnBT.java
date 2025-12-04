package com.ssk.java.dsaprep.recursion.practice;

/*
    How Many Binary Search Trees With N Nodes
		Write a function that returns the number of distinct binary search trees that can be constructed with n nodes. For the purpose of this exercise, do solve the problem using recursion first even if you see some non-recursive approaches.

		Example One
			{
			"n": 1
			}
			Output:
				1
		Example Two
			{
			"n": 2
			}
			Output:
				2
			Suppose the values are 1 and 2, then the two trees that are possible are

			   (2)            (1)
			  /       and       \
			(1)                  (2)
		Example Three
			{
			"n": 3
			}
			Output:
				5
			Suppose the values are 1, 2, 3 then the possible trees are

				   (3)
				  /
				(2)
			   /
			(1)

			   (3)
			  /
			(1)
			   \
			   (2)

			(1)
			   \
				(2)
				  \
				   (3)

			(1)
			   \
				(3)
			   /
			(2)

			   (2)
			  /   \
			(1)    (3)

		Constraints:
			1 <= n <= 16
*/

import java.util.HashMap;
import java.util.Map;

public class CountBSTnBT {
    public static void main(String[] args) {
        int n=3;
        Long bstCount=new CountBSTnBT().getBSTCountRecurssion(n,new HashMap<Integer,Long>());
        System.out.println(bstCount);

        // BST and BT count using catalan binomial coeff
//        int catalanBSTCount=new CountBSTnBT().getBSTCount(n);
//        int catalanBTCount=new CountBSTnBT().getBTCount(n);
//        System.out.println("BST Count - "+catalanBSTCount+" BT Count - "+catalanBTCount);
    }

    public Long getBSTCountRecurssion(int n, Map<Integer,Long> m){
        // base cases
        if(n==0L || n==1L) return 1L;
        if(n==2L) return 2L;
        else if(m.containsKey(n)) return m.get(n);

        // initilize
        Long count=0L;

        // Calculate left and right nodes and find the count
        for(int i=0;i<n;i++){
            Long left=getBSTCountRecurssion(i,m);
            Long right=getBSTCountRecurssion(n-i-1,m);
            count+=left*right;
        }
        m.put(n,count);
        return count;

    }

    // Non Recursive using Catala - binomial coeff
//    public int getBSTCount(int n){
//        return catalan(n);
//    }
//
//    public int getBTCount(int n){
//        return catalan(n)*fact(n);
//    }
//
//    public int catalan(int n){
//        int c=binomial_coeff(2*n,n);
//        return c/(n+1);
//    }
//
//    public int binomial_coeff(int n,int k){
//        // initilize
//        int res=1;
//        if(k>n-k) k=n-k;
//
//        // Calculate [n*(n-1)*(n-2)...1] / [k*(K-1)*(k-2)...1]
//        for(int i=0;i<k;++i){
//            res*=(n-i);
//            res/=(i+1);
//        }
//        return res;
//    }
//
//    public int fact(int n){
//        int factValue=1;
//        for(int i=1;i<=n;++i) factValue*=i;
//        return factValue;
//    }
}
