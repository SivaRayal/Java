package com.ssk.java.dsaprep.maths;

/*
    Write a program to find the area of a triangle. Take the length of sides as user input. (Area printed should be rounded off to two decimal places).
*/

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c sides of traingle :");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.printf("Area of traingle : %.2f",calculateArea(a,b,c));
    }

    public static double calculateArea(int a,int b, int c){
        // using Ecludian formula for calculating triangle area for given 3 sides
         int s=(a+b+c)/2;
         return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
