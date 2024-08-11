package com.ssk.java.code365;

/*
    Do not use division operation
    constraint - +- 32 bit
    ans[i] =

    input  nums = [1,2,3,4]
    output = [24,12,8,6]

    input nums=[-1,1,0,-3,3]
    output = [0,0,9,0,0]
*/

import java.util.Arrays;

public class ProductOfArraySelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] out=new ProductOfArraySelf().outpurArray(nums);
        System.out.println(Arrays.toString(out));
    }

    public int[] outpurArray(int[] inp){

    /*
        find product of array
        if product is zero ( return array of product skipping 0 element for 0th element
        For non Zeros :
            Recursive method to get count where the product==num[i] // base case
    */

        int count=0;
        int product=1;
        int[] out=new int[inp.length];
        // find product of array ignoring 0s in input.
        for(int i=0;i<inp.length;i++){
            if(inp[i]==0){
                count++;
                continue;
            }
            product*=inp[i];
        }

        // final product == zero case
        if(count>0){
            for(int i=0;i<inp.length;i++){
                if(inp[i]==0){
                    out[i]=product;
                    continue;
                }
                out[i]=0;
            }
            return out;
        }

        // Non 0 case
        for(int i=0;i<inp.length;i++){
            out[i]=getCount(product,inp[i],1);
        }
        return out;
    }

    // get num[i] equals to product with out using division operation.
    public int getCount(int product, int currentElement, int count){
        // base case
        if(product==currentElement){
            return count;
        }

        // recursive case
        count=getCount(product-currentElement,currentElement,count+1);
        return count;
    }
}
