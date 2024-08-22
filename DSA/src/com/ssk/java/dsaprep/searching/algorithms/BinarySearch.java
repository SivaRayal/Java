package com.ssk.java.dsaprep.searching.algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] inp={2,3,4,6,7};
        int pos=new BinarySearch().getBinarySearch(inp,7, 0,inp.length-1);
        System.out.println("Found at Position - "+pos);
    }


    // O(n/2)
    public int getBinarySearch(int[] inp,int searchKey, int l,int r){
         /* BinarySearch(): // applicable only to sorted arrays.
            mid = l+r / 2;
            // base case
            if ( searchKey == arr[mid] )
                return mid;
            if ( searchKey < arr[mid] )
                return recuscallcall(arr, l, mid-1);
            return recuscallcall(arr, mid+1, r);
        */
        if(l<=r){
            int mid=l+(r-l)/2;
            //base case
            if(inp[mid]==searchKey)
                return mid;
            if(searchKey < inp[mid])
                return getBinarySearch(inp,l,mid-1,searchKey);
            return getBinarySearch(inp, mid+1, r, searchKey);
        }
        return -1;
    }
}
