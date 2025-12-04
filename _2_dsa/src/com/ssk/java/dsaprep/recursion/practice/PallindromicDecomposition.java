package com.ssk.java.dsaprep.recursion.practice;

/*
    Palindromic Decomposition Of A String
		Find all palindromic decompositions of a given string s.
		A palindromic decomposition of string is a decomposition of the string into substrings, such that all those substrings are valid palindromes.
		Example
			{
			"s": "abracadabra"
			}
			Output:
			["a|b|r|a|c|ada|b|r|a", "a|b|r|aca|d|a|b|r|a", "a|b|r|a|c|a|d|a|b|r|a"]
		Notes
			Any string is its own substring.
			Output should include ALL possible palindromic decompositions of the given string.
			Order of decompositions in the output does not matter.
			To separate substrings in the decomposed string, use | as a separator.
			Order of characters in a decomposition must remain the same as in the given string. For example, for s = "ab", return ["a|b"] and not ["b|a"].
			Strings in the output must not contain whitespace. For example, ["a |b"] or ["a| b"] is incorrect.

		Constraints:
			1 <= length of s <= 20
			s only contains lowercase English letters.
*/

import java.util.ArrayList;
import java.util.List;

public class PallindromicDecomposition {
    public static void main(String[] args) {
        String s="abracadabra";
        // initilize
        char[] input=s.toCharArray();
        List<String> output=new ArrayList<>();
        new PallindromicDecomposition().getPallindromicDecompositionHelper(input,0,new StringBuilder(),output);

        // print output
        System.out.println(output);
    }

    // convert string to char arr (input)
    // Start recursive loop with index=0 to input.length.
    // Base case : if index == input.length : copy aux to ouput.
    // recursive case : for each iteration (index to input.length)
    //      get substring ( index to ith element )
    //      check if substring is pallindrom
    //          if pallindrom append substring to aux : append |
    //          and recursive loop for remaining elements of input char[] starting from index=i+1 to input.length
    //          aux cleanup for appended subarrays with |  remove sub string of aux( aux.length-sub str length -1 , aux.length)
    public void getPallindromicDecompositionHelper(char[] input,int index,StringBuilder aux,List<String> output){
        if(index==input.length){
            output.add(aux.substring(0,aux.length()-1));
            return;
        }
        for(int i=index;i<input.length;i++){
            String subString=new String(input,index,i-index+1);
            if(isPallindrome(input,index,i)){
                aux.append(subString);
                aux.append("|");
                getPallindromicDecompositionHelper(input,i+1,aux,output);
                aux.delete(aux.length()-subString.length()-1,aux.length());
            }
        }

    }

    public boolean isPallindrome(char[] input,int l, int r){
        while(l<=r)
            if(input[l++]!=input[r--]) return false;

        return true;
    }

}
