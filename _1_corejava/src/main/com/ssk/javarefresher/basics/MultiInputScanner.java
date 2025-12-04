package main.com.ssk.javarefresher.basics;

import java.util.Scanner;

public class MultiInputScanner {
    public static void main(String[] args) {
        System.out.println("Enter INTEGER input: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter FLOAT input: ");
        float b = sc.nextFloat();

        System.out.println("Enter LONG input: ");
        long c = sc.nextLong();

        System.out.println("Enter BYTE input: ");
        byte d = sc.nextByte();

        System.out.println("Enter STRING input: ");
        String e = sc.next();

        PrintNewLine.printNew(a);
        PrintNewLine.printNew(b);
        PrintNewLine.printNew(c);
        PrintNewLine.printNew(d);
        PrintNewLine.printNew(e);
    }
}
