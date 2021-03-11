import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

       
        int element = scn.nextInt();
        
        search(mat, element);
    }
        
        public static boolean search(int mat[][], int element){
            
            int nr = mat.length;
            int nc = nr;
            
            int i = 0;
            int j = nc-1;
        
        
        
            while (i<=nr-1 && j>=0){
                int val = mat[i][j];
            
            if(element<val){
                j--;
                
            }else if(element>val){
                i++;
                
            }else{
                
                System.out.println(i+""+j);
                return true;
            }
        }
        
        System.out.println("Not Found");
        return false;
        }
    }
