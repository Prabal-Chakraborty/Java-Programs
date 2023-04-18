package com.Prabal.Recursions.Backtracking;

import java.util.ArrayList;

public class PathWithObstacle {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathWithObs("",board,0,0);

    }
   static void pathWithObs(String p, boolean [][] maze, int row, int col){
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[row][col]){
            return;
        }
        if (row < maze.length-1){
            pathWithObs(p+'D',maze,row+1,col);
        }
       if (col < maze[0].length-1){
           pathWithObs(p+'R',maze,row,col+1);
       }
   }
}
