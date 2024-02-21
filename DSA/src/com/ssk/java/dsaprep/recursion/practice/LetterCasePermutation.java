package com.ssk.java.dsaprep.recursion.practice;


import java.util.ArrayList;
import java.util.Scanner;

/*
Given a string S we can transform every letter individually to be lowercase or upper case to create another sting, Return a list of all possible strings we could create
	Eg :
		s= "a1b2"
		output = ["a1b2","a1B2","A1b2","A1B2"]

		s="3z4"
		output = ["3z4","3Z4"]

		s="12345"
		output=["12345"]
*/
public class LetterCasePermutation {
    static ArrayList<String> out = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter alpha numberic string :");
        String input=sc.next();


        letterCase_helper(input,0,new StringBuilder());
        System.out.format("Possible letter case for '%s' are: %s",input,out);
    }

    public static void letterCase_helper(String input,Integer indx,StringBuilder sb){
        //base case
        if(indx==input.length()){
            out.add(sb.toString());
            return;
        }

        // iterative
        char currentPos = input.charAt(indx);
        if(Character.isDigit(currentPos)){  // exclude / skip Digit case
            sb.append(currentPos);
            letterCase_helper(input,indx+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }else{ // character case
            sb.append(Character.toLowerCase(currentPos));
            letterCase_helper(input,indx+1,sb);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toUpperCase(currentPos));
            letterCase_helper(input,indx+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
