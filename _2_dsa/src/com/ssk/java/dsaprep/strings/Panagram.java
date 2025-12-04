package com.ssk.java.dsaprep.strings;

/*
    Problem: Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English alphabet.
	Examples:
        Input: str = "The quick brown fox jumps over the lazy dog”
        Output: The quick brown fox jumps over the lazy dog is a Pangram
    	Explanation: The statement contains all the characters from ‘a’ to ‘z’
*/

public class Panagram {
    public static void main(String[] args) {
        String inp="The quick brown fox jumps over the lazy dog";
        if(new Panagram().isPanagram(inp))
            System.out.println(inp+" is a Panagram");
        else
            System.out.println(inp+" not a Panagram");
    }

    public boolean isPanagram(String inp){
        if(inp.length()<26)
            return false;
        boolean[] visited=new boolean[26];
        for(int i=0;i<inp.length();i++){
            char c=inp.charAt(i);
            if(c>='a'&&c<='z'){
                int index=c-'a';
                visited[index]=true;
            }
            if(c>='A'&&c<='Z') {
                int index=c-'A';
                visited[index]=true;
            }
        }
        boolean panagramCheck=true;
        for (int i=0;i<visited.length;i++)
            if(visited[i]==false){
//                panagramCheck=false;
//                break;
                return  false;
            }
        return panagramCheck;
    }
}
