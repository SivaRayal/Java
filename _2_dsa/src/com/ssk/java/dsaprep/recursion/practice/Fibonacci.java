package com.ssk.java.dsaprep.recursion.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // print nth number in fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number to get value in fibanocci series: ");
        int n=sc.nextInt();
        //Iterative
        fib_itr(n);

        //Recursive
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        System.out.println("Nth value in Recursive fibanocci series - "+fib(n-1,map));
        System.out.println("Recursive fibanocci series - "+map.values());

        //Golden ratio
        System.out.println("GoldenRation - "+fib_gr(n));
    }

    // Iterative
    public static void fib_itr(int n){
        int nextPrevValue=0,prevValue=1,current=0;
        System.out.print("Iterative fibanocci series - "+nextPrevValue+" "+prevValue+" ");
        for(int i=2;i<n;i++){
            current=nextPrevValue+prevValue;
            nextPrevValue=prevValue;
            prevValue=current;

            System.out.print(current+" ");
        }
        System.out.println();
        System.out.println("Nth value in Iterative fibanocci series - "+current);
    }


    // recursive
    public static int fib(int n,HashMap<Integer,Integer> map){
        // Pick cached value from map instead of repeating calculation for same keys.
        if(map.containsKey(n)){
            return map.get(n);
        }
        else {
            int prevValue = map.containsKey(n-1)?map.get(n-1):fib(n-1,map);
            int nextPrevValue = map.containsKey(n-1)?map.get(n-2):fib(n-2,map);
            map.put(n,prevValue+nextPrevValue);
            return map.get(n);
        }
    }

    //Golden Ratio
    public static Integer fib_gr(int n){
        double goldnRation_psi = 1.618033988749895;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        return (int)Math.round(goldnRation_psi*fib(n-2,map));
    }

}
