package com.Prabal.Recursions.Backtracking;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathsAll("",board,0,0);

    }
    static void pathsAll(String p, boolean [][] maze, int row, int col){
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[row][col]){
            return;
        }
        maze[row][col] = false;

        if (row < maze.length-1){
            pathsAll(p+'D',maze,row+1,col);
        }
        if (col < maze[0].length-1){
            pathsAll(p+'R',maze,row,col+1);
        }
        if (row >0){
            pathsAll(p+'U',maze,row-1,col);
        }
        if (col > 0){
            pathsAll(p+'L',maze,row,col-1);
        }
        maze[row][col]=true;
    }
}
