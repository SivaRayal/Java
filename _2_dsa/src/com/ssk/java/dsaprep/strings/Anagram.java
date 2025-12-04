package com.ssk.java.dsaprep.strings;

/*
   	Problem: Given two strings, check whether two strings are an anagram of each other. Two strings are said to be an anagram of each other if they are just permutations of each other. That is, the set of characters in both the strings must be the same, only the order of characters can be different.
        Input: string1 = "abcd"
        string2 = "bcad"
        Output: Yes
*/

public class Anagram {
    public static void main(String[] args) {
        String str1="abcd",str2="bcad";

        if(new Anagram().isAnagram(str1,str2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        else{
            int countIndex[]=new int[256];
            for(int i=0;i<str1.length();i++){
                countIndex[str1.charAt(i)]++;
                countIndex[str2.charAt(i)]--;
            }

            for(int i=0;i<countIndex.length;i++){
                if(countIndex[i]>0)
                    return false;
            }
        }
        return true;
    }
}
