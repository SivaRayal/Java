package com.ssk.java.dsaprep.searching.algorithms;

public class TernarySearch {
    public static void main(String[] args) {
        int[] input={2,4,6,8,9};
        int ouputIndex=new TernarySearch().getTernerySearch(input,6,0,input.length);
        String ouput=(ouputIndex>-1)?"Found at index - "+ouputIndex:"Not Found";
        System.out.println(ouput);
    }
    /*
        // TernarySearch() // applicable only to sorted arrays.
        mid1 = l+(r-1)/3 ; mid2 = r-(r-l)/3
        if(key==mid1) return mid1
        if(key==mid2) return mid2
        if(key<mid1) return  TernarySearch(l,mid1+1,key,arr)
        else if(key>mid2) return  TernarySearch(mid2+1,r,key,arr)
        else return  TernarySearch(mid1+1,mid2-1,key,arr)
    */
    public int getTernerySearch(int[] inp,int key,int l,int r){
        if(l<=r){
            int mid1=l+(r-l)/3;
            int mid2=r-(r-l)/3;
            if(key==inp[mid1]) return mid1;
            if(key==inp[mid2]) return mid2;
            if(key<inp[mid1]) return getTernerySearch(inp,key,l,mid1-1);
            else if(key>inp[mid2]) return getTernerySearch(inp,key,mid2+1,r);
            else return getTernerySearch(inp,key,mid1+1,mid2-1);
        }
        return -1;
    }
}
