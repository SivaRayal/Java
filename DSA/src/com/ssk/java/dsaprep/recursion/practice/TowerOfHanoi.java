package com.ssk.java.dsaprep.recursion.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
