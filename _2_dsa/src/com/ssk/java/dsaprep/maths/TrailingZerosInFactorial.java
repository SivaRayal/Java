package com.ssk.java.dsaprep.maths;

import java.util.Scanner;

/*
    Trailing Zeros in factorial
	Examples :
		Input: 5
		Output: 1
		// Factorial of 5 = 5*4*3*2*1 = 120, which has one trailing 0.

		Input: 20
		Output: 4
		// Factorial of 20 = 20*19*18*.... 3*2*1 = 2432902008176640000 which has 4 trailing zeroes.

		Input: 100
		Output: 24

*/

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.print("Enter number to find factorial - ");
        long inp=new Scanner(System.in).nextLong();
        System.out.println("Training 0's count for ("+inp+")! is - "+getTrainingZerorsforN(inp));
    }

    public static int getTrainingZerorsforN(long n){
        if(n <0)
            return -1;
        int result=0;
//        while(n/5>=1){
//            result+=n/5;
//            n=n/5;
//        }
        for(int i=5;n/i>=1;i*=5){
            result+=n/i;
        }
        return result;
    }
}
