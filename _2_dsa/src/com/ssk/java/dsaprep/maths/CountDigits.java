package com.ssk.java.dsaprep.maths;

/*
    Count the number of digits in a number.
*/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.print("Enter input number to count digits : ");
        int input=new Scanner(System.in).nextInt();
        CountDigits cd = new CountDigits();
        System.out.println("Digit count in given number - "+cd.getDigitCount(input));
    }

    public int getDigitCount(int input){
        // input / 10 >> count++ & input=input%10;
        int out=0,q=0;
        while(input!=0){
            out++;
            input/=10;
        }
        return out;
    }
}
