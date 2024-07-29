package com.ssk.java.dsaprep.maths;

/*
    Take user input amount of money and consider an infinite supply of denominations 1, 20, 50 and 100. What is the minimum number of denominations to make the change?
*/

import java.util.Scanner;

public class MinimumOrderDenomination {
    public static void main(String[] args) {
        System.out.print("Enter input amount : ");
        int input = new Scanner(System.in).nextInt();

        System.out.println("Minimum Number of Denomination to make the change - "+getDenominationCal(input));
    }

    public static int getDenominationCal(int input){
        int out=0;
        int q=0;
        // no loops O(1)
        q=input/100;
        input=input-q*100;
        out+=q;

        q=input/50;
        input=input-q*50;
        out+=q;

        q=input/20;
        input=input-q*20;
        out+=q;

        //for 1 rupee
        out+=input;

        return out;
    }
}
