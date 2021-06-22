// import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static boolean isValid(int[][] board,int r, int c , int key){
        // Check row
        for(int row = r , col = 0; col < 9; col++){
            if(board[row][col] == key) return false;
        }
        
        //Check col
        for(int row = 0 , col = c; row < 9 ; row++){
            if(board[row][col] == key) return false;
        }
        
        int row = (r / 3)*3;
        int col = (c / 3)*3;
        
        for(int i = 0;i < 3;i++){
            for(int j=0;j < 3;j++){
                if(board[row+i][col+j] == key) return false;
            }
        }
        
        return true;
    }
   

  public static void solveSudoku(int[][] board, int r, int c) {
    if(r == 9){
        display(board);
        return;
    }
    int nr, nc;
    if(c == 8){
        nr = r + 1;
        nc = 0;
    }else{
        nr = r;
        nc = c + 1;
    }
    if(board[r][c] != 0){
        solveSudoku(board, nr, nc);
    }else{
        for(int num = 1; num <= 9; num++){
            if(isValid(board, r, c, num)){
                board[r][c] = num;
                solveSudoku(board, nr, nc);
                board[r][c] = 0;
            }
        }
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    solveSudoku(arr, 0, 0);
  }
}

