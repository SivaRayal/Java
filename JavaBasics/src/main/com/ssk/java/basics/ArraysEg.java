package main.com.ssk.java.basics;

import java.util.Arrays;

public class ArraysEg {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[1]=2;
        a[0]=3;
        a[2]=1;
        System.out.println(a[0]+","+a[1]+","+a[2]);

        String s1[]={"SIVA","Rayal","SSK"};
        String s2[]={"siva","rayal","ssk"};
        if(Arrays.equals(s1,s2,String::compareToIgnoreCase))
            System.out.println("Bother arrays are same");
        else
            System.out.println("Not same");
    }
}
