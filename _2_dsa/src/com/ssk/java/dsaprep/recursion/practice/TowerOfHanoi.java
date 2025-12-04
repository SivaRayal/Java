package com.ssk.java.dsaprep.recursion.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    Tower Of Hanoi
		Tower of Hanoi is a mathematical puzzle where we have three pegs and n disks. The objective of the puzzle is to move the entire stack to another peg, obeying the following simple rules:
			Only one disk can be moved at a time.
			Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
			No disk may be placed on top of a smaller disk.
			Given n denoting the number of disks in the first peg, return all the steps required to move all disks from the first peg to the third peg in minimal number of steps.

		Example
			{
			"n": 4
			}
			Output:
				[
				[1, 2],
				[1, 3],
				[2, 3],
				[1, 2],
				[3, 1],
				[3, 2],
				[1, 2],
				[1, 3],
				[2, 3],
				[2, 1],
				[3, 1],
				[2, 3],
				[1, 2],
				[1, 3],
				[2, 3]
				]

		Following steps:
			[1, 2] = Shift top disk of the first peg to top of the second peg.
			Picture after this step will be:
			First peg: 2 3 4
			Second peg: 1
			Third peg: Empty

			[1, 3] = Shift top disk of the first peg to top of the third peg.
			Picture after this step will be:
			First peg: 3 4
			Second peg: 1
			Third peg: 2

			Similarly after following remaining steps, the final configuration will be:
			First peg: Empty
			Second peg: Empty
			Third peg: 1 2 3 4

			Hence, our objective is achieved.

		Notes
			Return a 2d integer array containing all the steps taken to move all n disks from the first peg to the third peg in minimal number of steps. Each row will have two integers denoting from peg and to peg, for example, if the ith row is [2, 3], then it means in this step, we moved the top disk on peg 2 to peg 3.

		Constraints:
			1 <= n <= 20
*/

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disk(n) - ");
        int n=sc.nextInt();

        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        tower_of_hanoi_helper(n,1,2,3,out);
        System.out.format("Step to solve tower of hanoi for %s disk :",n);
        System.out.println(out);
    }

    public static void tower_of_hanoi_helper(Integer disk,Integer src,Integer aux,Integer dst,ArrayList<ArrayList<Integer>> out){
        if(disk==1){
            out.add(new ArrayList<>(Arrays.asList(src,dst)));
            return;
        }
        else{
            // transfer n-1 disks from src to aux
            tower_of_hanoi_helper(disk-1,src,dst,aux,out);

            // transfer 1 disk from src to dst
            tower_of_hanoi_helper(1,src,aux,dst,out);

            // transfer n-1 disks from aux to dst
            tower_of_hanoi_helper(disk-1,aux,src,dst,out);

        }
    }
}
