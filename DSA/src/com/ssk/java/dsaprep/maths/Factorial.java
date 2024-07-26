package com.ssk.java.dsaprep.maths;

import java.math.BigInteger;
import java.util.Scanner;
/*
    Find Factorial of give number
*/

public class Factorial {
    public static BigInteger findNfactorial(BigInteger n){
        if(n==BigInteger.ZERO)
            return BigInteger.ONE;
        return n.multiply(findNfactorial(n.subtract(BigInteger.ONE)));
    }
    public static void main(String[] args) {
        System.out.println("Enter number to find factorial :");
        Scanner sc = new Scanner(System.in);
        long inp=sc.nextLong();
        System.out.println("Factorial of "+inp+" is - "+findNfactorial(BigInteger.valueOf(inp)));
    }
}
