package com.ssk.java.dsaprep.sorting.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Segregate Even And Odd Numbers
Given an array of numbers, rearrange them in-place so that even numbers appear before odd ones.

Example
	{
	"numbers": [1, 2, 3, 4]
	}
Output:
	[4, 2, 3, 1]
The order within the group of even numbers does not matter; same with odd numbers. So the following are also correct outputs: [4, 2, 1, 3], [2, 4, 1, 3], [2, 4, 3, 1].

Notes
It is important to practice solving this problem by rearranging numbers in-place.
There is no need to preserve the original order within the even and within the odd numbers.
We look for a solution of the linear time complexity that uses constant auxiliary space.
Constraints:
	1 <= length of the array <= 105
	1 <= element of the array <= 109

*/
public class EvenOddSegregator {
    public static void main(String[] args) {
        List<Integer> input=Arrays.asList(1,2,3,4);
        int evenCounter=0;
        System.out.println("before Segration - "+input);
        for(int i=0;i<input.size();i++){
            if(input.get(i)%2==0){
                 Collections.swap(input,i,evenCounter);
                 evenCounter++;
            }
        }
        System.out.println("After segration - "+input);
    }
}
