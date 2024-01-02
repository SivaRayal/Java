package main.com.ssk.java.basics;

import java.util.Scanner;

/*

Working with 2D arrays is quite important. Here we will do swapping of column in a 2D array. You are given a matrix M or r rows and c columns. You need to swap the first column with the last column.

        Example:

        Input:
        3 4
        1 2 3 4
        4 3 2 1
        6 7 8 9

        Output:
        4 2 3 1
        1 3 2 4
        9 7 8 6
*/

public class MatrixFormater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 2d-matrix rows (m): ");
        int m = sc.nextInt();
        System.out.println("Enter size of 2d-matrix columns (n): ");
        int n = sc.nextInt();

        int[][] input=new int[m][n];
        System.out.println("Enter element of matrix :");
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                input[i][j]=sc.nextInt();
            }
        }
        int[][] output=getUpdatedMatrix(input,m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int[][] getUpdatedMatrix(int[][] input,int m, int n){
        int[][] output=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    output[i][n-1]=input[i][j];
                }
                else if(j ==n-1){
                    output[i][0]=input[i][j];
                }else {
                    output[i][j]=input[i][j];
                }
            }
        }
        return output;
    }
}
