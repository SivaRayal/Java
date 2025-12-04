package com.ssk.java.dsaprep.backtracking;


/*
    Sudoku Solver
		Given a partially filled two-dimensional array, fill all the unfilled cells such that each row, each column and each 3 x 3 subgrid (as highlighted below by bolder lines) has every digit from 1 to 9 exactly once.
		Unfilled cells have a value of 0 on the given board.

		Example
		Example one
			{
			"board": [
			[8, 4, 9, 0, 0, 3, 5, 7, 0],
			[0, 1, 0, 0, 0, 0, 0, 0, 0],
			[7, 0, 0, 0, 9, 0, 0, 8, 3],
			[0, 0, 0, 9, 4, 6, 7, 0, 0],
			[0, 8, 0, 0, 5, 0, 0, 4, 0],
			[0, 0, 6, 8, 7, 2, 0, 0, 0],
			[5, 7, 0, 0, 1, 0, 0, 0, 4],
			[0, 0, 0, 0, 0, 0, 0, 1, 0],
			[0, 2, 1, 7, 0, 0, 8, 6, 5]
			]
			}
			Output:
				[
				[8, 4, 9, 1, 6, 3, 5, 7, 2],
				[3, 1, 5, 2, 8, 7, 4, 9, 6],
				[7, 6, 2, 4, 9, 5, 1, 8, 3],
				[1, 5, 3, 9, 4, 6, 7, 2, 8],
				[2, 8, 7, 3, 5, 1, 6, 4, 9],
				[4, 9, 6, 8, 7, 2, 3, 5, 1],
				[5, 7, 8, 6, 1, 9, 2, 3, 4],
				[6, 3, 4, 5, 2, 8, 9, 1, 7],
				[9, 2, 1, 7, 3, 4, 8, 6, 5]
				]

		Notes
			You can assume that any given puzzle will have exactly one solution.

		Constraints:
			Size of the input array is exactly 9 x 9
			0 <= value in the input array <= 9
*/

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] input={ {8, 4, 9, 0, 0, 3, 5, 7, 0},
                        {0, 1, 0, 0, 0, 0, 0, 0, 0},
                        {7, 0, 0, 0, 9, 0, 0, 8, 3},
                        {0, 0, 0, 9, 4, 6, 7, 0, 0},
                        {0, 8, 0, 0, 5, 0, 0, 4, 0},
                        {0, 0, 6, 8, 7, 2, 0, 0, 0},
                        {5, 7, 0, 0, 1, 0, 0, 0, 4},
                        {0, 0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 2, 1, 7, 0, 0, 8, 6, 5} };
        if(isSudokuSolved(input)){}
        for(int[] row:input)
            System.out.println(Arrays.toString(row));
    }

    public static boolean isSudokuSolved(int[][] board){
        for(int col=0;col<board.length;col++){
            for(int row=0;row<board[col].length;row++){
                int currentVal=board[col][row];
                if(currentVal==0){
                    for(int k=1;k<=9;k++){
                        if(isValidRow(board,col,k) && isValidColum(board,row,k) && isValidBox(board,col,row,k)){
                            board[col][row]=k;
                            if(isSudokuSolved(board))    return true;
                            board[col][row]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidRow(int[][] board, int row, int val){
        for(int col=0;col<9;col++)
            if(board[row][col]==val)
                return false;
        return true;
    }

    public static boolean isValidColum(int[][] board, int col, int val){
        for(int row=0;row<9;row++)
            if(board[row][col]==val)
                return false;
        return true;
    }

    public static boolean isValidBox(int[][] board, int row, int col, int val){
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int j=startCol;j<startCol+3;j++)
            for(int i=startRow;i<startRow+3;i++){
                if(board[i][j]==val)
                    return false;
            }
        return true;
    }
}
