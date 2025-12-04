package com.ssk.java.dsaprep.sorting.practice;

/*
    Sort All Characters
		Given a list of characters, sort it in the non-decreasing order based on ASCII values of characters.
		Example
			{
			"arr": ["a", "s", "d", "f", "g", "*", "&", "!", "z", "y"]
			}
		Output:
			["!", "&", "*", "a", "d", "f", "g", "s", "y", "z"]

		Constraints:
			1 <= length of the list <= 100000
			Input list consists of alphanumeric characters and these ones: !, @, #, $, %, ^, &, *, (, ).

*/

import java.util.ArrayList;
import java.util.Arrays;

public class SortAllCharacters {
    public static void main(String[] args) {
        // initilize preload input
        ArrayList<Character> inpArr=new ArrayList<>(Arrays.asList('a', 's', 'd', 'f', 'g', '*', '&', '!', 'z', 'y'));
        ArrayList<Character> outArr=new ArrayList<>();

        // increment the ascii index of the identified char
        int[] charCounter=new int[128];
        for(Character c:inpArr) charCounter[c]++;

        // print output
        for(int i=0;i<128;i++){
            while(charCounter[i]-->0) {
                outArr.add((char) i);
            }
        }
        System.out.println(outArr.toString());
    }
}
