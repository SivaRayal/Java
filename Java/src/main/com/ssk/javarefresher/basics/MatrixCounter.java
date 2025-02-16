package main.com.ssk.javarefresher.basics;
/*
Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.

        Example 1:

        Input:
        3
        1 1 0
        1 1 0
        1 1 0

        Output:
        2

        Explanation:
        2nd column (0-based indexing) is having 3 zeros which is maximum.
*/


import java.util.Scanner;

public class MatrixCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NxN matrix size: ");
        int size = sc.nextInt();
        int[][] input=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                input[i][j]= sc.nextInt();
            }
        }

        System.out.println("Max Zero found in column - "+getMaxZeroColumn(input,size));
    }

    public static int getMaxZeroColumn(int[][] input,int size){
        int outColumn=0;
        int maxZeroCount=0;
        for(int j=0;j<size;j++){
            int zeroCounter=0;
            for(int i=0;i<size;i++){
                if(input[i][j]==0){
                    zeroCounter++;
                }
            }
            if(maxZeroCount<zeroCounter){
                maxZeroCount=zeroCounter;
                zeroCounter=0;
                outColumn=j;
            }
        }
        return outColumn;

    }

}
