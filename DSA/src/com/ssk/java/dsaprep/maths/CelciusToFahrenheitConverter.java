package com.ssk.java.dsaprep.maths;

/*
    Write a program to convert temperature given in Celsius (user input) to Fahrenheit.

*/

import java.util.Scanner;

public class CelciusToFahrenheitConverter {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celcius: ");
        float inputC= new Scanner(System.in).nextFloat();
        System.out.printf("Temperature in Fahrenheit - %.2f",temperatureCtoFConverter(inputC));
    }
    public static double temperatureCtoFConverter(float celcius){
        return (9.0/5)*celcius+32;
    }
}
