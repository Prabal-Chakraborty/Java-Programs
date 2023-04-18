package com.Prabal.Recursions.Backtracking;

import java.util.Arrays;

public class AllPathsWithStepsPrinted {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathsAllPrinted("",board,0,0,1,path);

    }
    static void pathsAllPrinted(String p, boolean [][] maze, int row, int col,int steps, int[][] path){
        if(row== maze.length-1 && col==maze[0].length-1){
            path[row][col] = steps;
            for (int[]arr: path)
            {
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        path[row][col] = steps;

        if (row < maze.length-1){
            pathsAllPrinted(p+'D',maze,row+1,col,steps+1,path);
        }
        if (col < maze[0].length-1){
            pathsAllPrinted(p+'R',maze,row,col+1,steps+1,path);
        }
        if (row >0){
            pathsAllPrinted(p+'U',maze,row-1,col,steps+1,path);
        }
        if (col > 0){
            pathsAllPrinted(p+'L',maze,row,col-1,steps+1,path);
        }
        maze[row][col]=true;
        path[row][col] = 0;
    }
}
