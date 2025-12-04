package main.com.ssk.javarefresher.basics;

/*
    Change the case of the character entered. (using operators only).
    input - a
    output - A

    input - A
    output - a

*/


import java.util.Scanner;

public class ChangeCaseOfChar {
    public static void main(String[] args) {
        System.out.print("Enter input character to conver case : ");
        char input = new Scanner(System.in).next().charAt(0);
        ChangeCaseOfChar ch = new ChangeCaseOfChar();
        System.out.println("Converted to : "+ch.caseConverterHandler(input));
    }

    public char caseConverterHandler(char input){
        // using ASIIC and operators comparisions :
        return (char)((input>='a'&&input<='z')?input-'a'+'A':input-'A'+'a');
    }
}
