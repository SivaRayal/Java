package com.ssk.java.basics;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        System.out.println("Enter inputs : [PLEASE ENTER INPUTS for STANDARD SIZE - 3]");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        PrintNewLine print = new PrintNewLine();
        print.printIntNewLine(a,b,c);
    }
}