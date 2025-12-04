package main.com.ssk.javarefresher.basics;

import java.util.Scanner;

public class FloatFormater {
    public static void main(String[] args) {
        System.out.println("Enter float value with more tha 3 f-points");
        float result= new Scanner(System.in).nextFloat();
        System.out.printf("Actual input - %f \nOriginal output - %.2f",result,result);
    }
}
