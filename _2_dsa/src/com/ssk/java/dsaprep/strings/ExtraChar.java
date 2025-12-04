package com.ssk.java.dsaprep.strings;

/*
   	Problem: Two strings are given of lengths n and n+1. The second string contains all the characters of the first string, but there is one extra character. The task is to find the extra character in the second string.
	Note: The characters in strings can be in any order.
	Examples :
    	Input: str1 = "abcd";
	    str2 = "cbdae";
    	Output: e
	    Explanation: str2 contains all the element of str1 with one extra alphabet 'e'.
*/

public class ExtraChar {
    public static void main(String[] args) {
        String inp1="abcd" , inp2="cbdae" ;

        // Method1: we can user sort and find not matching char seq
        // Method2: Mark the visited char find the odd case not visited by str1
        // Method3: Using Map to cal freq add and sub find the odd one with freq 1
        // Method4: Using bitwise XOR ( which will return 0 for same char ) returns the char integer value
        int oddCharValue=0;
        for(int i=0;i<inp1.length();i++){
            oddCharValue=oddCharValue^inp1.charAt(i)^inp2.charAt(i);
        }
        oddCharValue=oddCharValue^inp2.charAt(inp1.length());
        System.out.println((char)oddCharValue);


    }
}
