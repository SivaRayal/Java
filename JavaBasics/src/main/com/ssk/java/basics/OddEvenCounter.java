package main.com.ssk.java.basics;

import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        System.out.println("Enter size of list");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] input= new int[size];
        System.out.println("Enter input values: ");
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        int evenCount=getEvenCount(input);
        int oddCount=size-evenCount;
        System.out.printf("Even Count - %d \nOdd Count - %d",evenCount,oddCount);
    }

    public static int getEvenCount(int[] input){
        int evenCount=0;
        for(int i=0;i< input.length;i++){
            if(input[i]%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
