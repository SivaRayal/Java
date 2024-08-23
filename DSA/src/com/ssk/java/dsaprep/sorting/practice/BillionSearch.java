package com.ssk.java.dsaprep.sorting.practice;


/*
    Four Billion
		Given four billion of 32-bit integers, return any one that’s not among them. Assume you have 1 GiB (10243 bytes) of memory.
		Follow up: what if you only have 10 MiB of memory?
		Example One
			{
			"arr": [0, 1, 2, 3]
			}
			Output:
			4
			Any number in the [4 .. 232) range is a correct answer.

		Example Two
			{
			"arr": [4294967295, 399999999, 0]
			}
			Output:
			1
			Here again 1 is just one of many correct answers.

		Notes
			Even though there won’t actually be a test with four billion numbers, do design and write a solution for four billion.

		Constraints:
			1 <= length of input array <= 200000
			0 <= element of input array < 232


    You can use counting sort to identify if number is present or not. but you heve to break the inmemory sort operations using merg by limiting the size
    Int - 4 bytes
    1Billion = 1GB (1024 Bytes) 1024*8 bytes = 10^9
    10MB - ?
        2^20 - 1MB
        2^20 * 10 - 10MB
        first 10MB in memory sort
        10MB to 20MB >> For 1GB ( 10MB * 100 = 1GB )
        For 4 Billion = 400 times
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BillionSearch {
    public static void main(String[] args) {
        // Preload input
        ArrayList<Long> inpArr = new ArrayList<>(Arrays.asList(4294967295L,399999999L,0L,3L));
        for(int i=0;i<inpArr.size();i++){
            while(i!=inpArr.get(i)){
                long correct=inpArr.get(i);
                if(correct<inpArr.size())
                    Collections.swap(inpArr,i,(int)correct);
                else
                    break;
            }
        }

        long integer=0L;
        for(int i=0;i<inpArr.size();i++)
            if(i!=inpArr.get(i)){
                integer=i;
                break;
            }
        long out= (integer==0L)? inpArr.size():integer;
        System.out.println(out);
    }
}
