package com.ssk.java.dsaprep.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
