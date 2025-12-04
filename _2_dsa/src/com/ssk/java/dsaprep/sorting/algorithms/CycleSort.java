package com.ssk.java.dsaprep.sorting.algorithms;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // Preload Input
        int[] inputArr={3,5,2,8,9,1};
        System.out.println("Before selection sort - "+ Arrays.toString(inputArr));
        new CycleSort().cycleSort(inputArr);
        System.out.println("After sorting - "+ Arrays.toString(inputArr));
    }

    public void cycleSort(int[] arr){
        for(int cycleStart=0;cycleStart<arr.length-1;cycleStart++){
            // Find the first element of the cycle to swap position
            // initilize pos and item
            int pos=cycleStart, item=arr[cycleStart];

            // check for the smaller element
            for(int i=cycleStart+1;i<arr.length;i++) if(arr[i]<item) pos++;

            // Move to next cycle if pos is not updated and equals to same cycle start.
            if(pos==cycleStart) continue;

            // increment pos for same elements
            while(arr[pos]==item) pos++;

            // Swap for the first element of cycle
            if(pos!=cycleStart){
                int temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }

            // repeat same steps for remaining elements of the cycle.
            while(pos!=cycleStart){
                pos=cycleStart;
                for(int i=cycleStart+1;i<arr.length;i++) if(arr[i]<item) pos++;
                while(item==arr[pos])   pos++;
                if(item!=arr[pos]){
                    int temp=item;
                    item=arr[pos];
                    arr[pos]=temp;
                }
            }

        }

    }

}
