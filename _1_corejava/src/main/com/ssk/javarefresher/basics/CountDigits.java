package main.com.ssk.javarefresher.basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input for finding number of digits : ");
        long num=sc.nextLong();
        System.out.println("Number of digits in input - "+countDigt(num));
    }

    static int countDigt(long num){
        if(num/10==0){
            return 1;
        }
        return 1+countDigt(num/10);
    }
}

