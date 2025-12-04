package main.com.ssk.javarefresher.basics;
/*

You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

*/

import java.util.Scanner;

public class PatterXYMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input xy pattern string: ");
        String input=sc.next();
        if(input.length()%2!=0){
            System.out.println(0);
        }else{

        }
    }
}
