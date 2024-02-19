package com.ssk.java.dsaprep.recursion.practice;

import java.util.Scanner;
/*
Print all decimal (0-9) strings of length n: ( combination of iterative and recursive - ending up with divide and conquer ).
*/

public class DecimalStringRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size(n) of decimal string to generate : ");
        Integer n = sc.nextInt();

        decimal_helper(n,"");
    }

    public static void decimal_helper(Integer n,String slate){
        if(n==0){
            System.out.println(slate);
        }else {
            for(int i=0;i<10;i++){
                decimal_helper(n-1,slate+i);
            }
        }
    }
}
