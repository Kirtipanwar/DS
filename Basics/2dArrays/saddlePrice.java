import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();


        int mat[][] = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
    int ans = saddlepoint(mat);
    
    if(saddlepoint(mat) == Integer.MAX_VALUE){
        System.out.println("Invalid input");
        
    }else{
        System.out.println(ans);
    }
    }
    
    
    //saddlepoint(mat); returns integer.max
    
    public static int saddlepoint(int mat[][]){
        int n = mat.length;
        
        for(int r=0; r<n; r++){
            int rowmin = Integer.MAX_VALUE;
            
            int colmin = -1;
            
            for(int c=0; c<n; c++){
                if(rowmin>mat[r][c]){
                    rowmin = mat[r][c];
                    colmin = c;
                }
            }
            
            boolean flag = true;
            
            for(int i=0 , j=colmin; i<n; i++){
                if(mat[i][j] > rowmin){
                    flag = false;
                    break;
                }
            }
            
            if(flag == true){
                return rowmin;
            }
            
        }
        
        return Integer.MAX_VALUE;
        
    }

}
