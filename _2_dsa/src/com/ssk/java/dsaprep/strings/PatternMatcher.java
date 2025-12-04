package com.ssk.java.dsaprep.strings;

/*
   	Problem: This is a basic Pattern search problem where a text and a word will be given. The task is to find in what all positions the is present in the text.
	Example:
        Input: text = "Welcome to the world of competetive programming"
        word = "world"
        Output: 15
        Explanation: The word "world" can be found at index position 15.
*/

public class PatternMatcher {
    public static void main(String[] args) {
        String inp="Welcome to the world of competetive programming";
        String pattern="world";
        new PatternMatcher().getPosition(inp,pattern);
    }

    public void getPosition(String inp,String pattern){
        int index=inp.indexOf(pattern);
        while(index>=0){
            System.out.println(index+" ");
            index=inp.indexOf(pattern,index+1);
        }
    }
}


