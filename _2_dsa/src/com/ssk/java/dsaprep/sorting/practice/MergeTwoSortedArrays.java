package com.ssk.java.dsaprep.sorting.practice;
/*
    Merge One Sorted Array Into Another
    First array has n positive numbers, and they are sorted in the non-descending order.
    Second array has 2n numbers: first n are also positive and sorted in the same way but the last n are all zeroes.
    Merge the first array into the second and return the latter. You should get 2n positive integers sorted in the non-descending order.

    Example
    {
    "first": [1, 3, 5],
    "second": [2, 4, 6, 0, 0, 0]
    }
    Output:
    [1, 2, 3, 4, 5, 6]

    Notes
    Constraints:
    1 <= n <= 105
    1 <= array elements (except those zeroes) <= 2 * 109

    You can use only constant auxiliary space.

*/

/*

    Algorithem:
        Similar to merge sort we can merge both arrays into aux by comparing on each side
            replay second array last elements with first arry
            Merge(a,start,mid,end)
                create aux memory
                i=start
                j=mid
                while(i<mid && j<=end)
                    if(a.get(i)<a.get(j))
                        aux.add(a.get(i))
                        i++
                  else
                    aux.add(a.get(j))
                    j++
                while(i<mid)
                    aux.add(a.get(i))
                    i++
                while(j<=end)
                    aux.add(a.get(j))
                    j++

                for ith in start - end:
                    a.set(ith,aux.get(ith-start))


*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 3, 5);
        List<Integer> second = Arrays.asList(2, 4, 6, 0, 0, 0);
        int secSize=second.size(),firstSize=first.size(),mid=secSize/2;
        System.out.println("First list before merge sort - "+first);
        System.out.println("Second list before merge sort - "+second);

        //Method - 1
//        for(int i=secSize/2; i<secSize; i++){
//            second.set(i,first.get(i-firstSize));
//        }
//
//        merge(second,0,mid,secSize-1);

        //Method 2
        int i=first.size()-1, j=i, k=second.size()-1;
        while( i>=0 && k>=0){
            // J representing 1st n digits of second araay
            if(j>=0 && second.get(j)>=first.get(i)){
                second.set(k,second.get(j));
                j--;
            }else{
                second.set(k,first.get(i));
                i--;
            }
            k--;
        }

        System.out.println("After merge sort - "+second);
    }

//    static void merge( List<Integer> a,int start,int mid,int end){
//        List<Integer> aux=new ArrayList<>();
//        int i = start, j = mid;
//
//        while(i<mid && j<=end){
//            if(a.get(i)<a.get(j)){
//                aux.add(a.get(i));
//                i++;
//            }else {
//                aux.add(a.get(j));
//                j++;
//            }
//        }
//
//        while(i<mid){
//            aux.add(a.get(i));
//            i++;
//        }
//
//        while(j<=end){
//            aux.add(a.get(j));
//            j++;
//        }
//
//        for(int ith=start;ith<=end;ith++){
//            a.set(ith,aux.get(ith-start));
//        }
//    }
}
