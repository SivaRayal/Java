package com.ssk.java.dsaprep.sorting.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*

Algorithm:
    mergesot(arr):
        divide(arr,start,end);

    divide(arr,start,end):
        if start==end
            return
        mid = start + (end-start)/2
        divide(arr,start,mid);
        divide(arr,mid+1,end)

        merge(arr,start,mid,end)

    merge(arr,start,mid,end)
        create aux memory
        i=start
        j=mid+1

        while( i<=mid && j<=end)
            if(arr.get(i) <arr.get(j)
                aux.add(arr.get(i))
                i++
            else
                aux.add(arr.get(j));
                j++

        while(i<=mid)
            aux.add(arr.get(i))
            i++

        while(j<=end)
            aux.add(arr.get(j))
            j++

        for ith in start - end
            arr.set(ith,aux.get(ith-start));

*/
public class MergeSortList {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(5,3,7,1,8,9);
        System.out.println("Before Merge Sort - "+input);
        sort(input,0,input.size()-1);
        System.out.println("After merge sort - "+input);
    }

    static void sort(List<Integer> arr,int start,int end){
        if(start==end){
            return;
        }
        int mid = (end-start)/2+start;
        sort(arr,start,mid);
        sort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }

    static void merge(List<Integer> a,int start,int mid,int end){
        List<Integer> aux=new ArrayList<>();
        int i = start, j = mid+1;

        while(i<=mid && j<=end){
            if(a.get(i)<a.get(j)){
                aux.add(a.get(i));
                i++;
            }else {
                aux.add(a.get(j));
                j++;
            }
        }

        while(i<=mid){
            aux.add(a.get(i));
            i++;
        }

        while(j<=end){
            aux.add(a.get(j));
            j++;
        }

        for(int ith=start;ith<=end;ith++){
            a.set(ith,aux.get(ith-start));
        }
    }
}
