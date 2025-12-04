package com.ssk.java.dsaprep.searching.algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] inp={2,5,8,4,1};
        int pos=new LinearSearch().getinearSearch(inp,1);
        String ouput=(pos>-1)?"Found at index - "+pos:"Not Found";
        System.out.println(ouput);
    }

    // Lienar Search algo
    public int getinearSearch(int[] inp, int searchKey){
        // iterate over the input array
        // if seach element is found print found
        // else -1 ( not found )
        // O(n)
        for(int i=0;i<inp.length;i++){
            if(inp[i]==searchKey){
               return i;
            }
        }
        return -1;
    }
}
