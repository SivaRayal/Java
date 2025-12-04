package com.ssk.java.dsaprep.sorting.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Dutch National Flag
Given some balls of three colors arranged in a line, rearrange them such that all the red balls go first, then green and then blue ones.
Do rearrange the balls in place. A solution that simply counts colors and overwrites the array is not the one we are looking for.
This is an important problem in search algorithms theory proposed by Dutch computer scientist Edsger Dijkstra. Dutch national flag has three colors (albeit different from ones used in this problem).

Example
	{
	"balls": ["G", "B", "G", "G", "R", "B", "R", "G"]
	}
Output:
	["R", "R", "G", "G", "G", "G", "B", "B"]
There are a total of 2 red, 4 green and 2 blue balls. In this order they appear in the correct output.

Notes
Constraints:
	1 <= n <= 100000
Do this in ONE pass over the array, NOT TWO passes
Solution is only allowed to use constant extra memory

Algorithm : Since we have 3 colors RGB we can use 2 pointers one for R start at 0th index and other will be blue pointer which will be at the end
    initilize red=0, blue=balls.size()-1, pointer=0;
    while(p<=blue)
        if balls.get(p) == R
            swap to the first location using redPointer
            red++
        if balls.get(p) == B
            swap the ball to end of the list using blue pointer
            blue++
        else
            just incremnter pointer to ignore all green which will fall in middle.

*/
public class DutchFlagRGB {
    public static void main(String[] args) {
        List<String> balls = Arrays.asList("G", "B", "G", "G", "R", "B", "R", "G");
        System.out.println("Input list - "+balls);

        int red=0,blue=balls.size()-1,pointer=0;
        while(pointer<=blue){
            if(balls.get(pointer)=="R"){
                Collections.swap(balls,pointer,red);
                red++;
            }
            if(balls.get(pointer)=="B"){
                Collections.swap(balls,pointer,blue);
                blue--;
            }
            else{
                pointer++;
            }
        }

        System.out.println("Sorted balls order - "+balls);
    }
}
