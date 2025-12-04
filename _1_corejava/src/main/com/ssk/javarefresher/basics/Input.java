package main.com.ssk.javarefresher.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter input string: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String inp1=br.readLine();
        System.out.println(inp1);

        System.out.println("Enter inputs : [PLEASE ENTER INPUTS for STANDARD SIZE - 3]");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        PrintNewLine print = new PrintNewLine();
        print.printIntNewLine(a,b,c);

        // Below Code dosent work in IDE. System.console() require console.
//        System.out.println("Enter input : ");
//        String inp3=System.console().readLine();
//        System.out.println(inp3);
    }
}