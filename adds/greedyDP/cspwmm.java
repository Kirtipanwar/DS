import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int moves[] = new int[n];
        for(int i=0; i<n; i++){
            moves[i] = scn.nextInt();
        }
        System.out.println(minMoves(moves));
    }
    public static int minMoves(int moves[]){
        int n = moves.length;
        int qb[] = new int[n+1];
    
        for(int i=n-1; i>=0; i--){
           int maxJmp = moves[i];
           
            if(maxJmp == 0){
               qb[i] = Integer.MAX_VALUE;
            }else{
                int minSteps = Integer.MAX_VALUE;
                for(int jmp=1; jmp<= maxJmp && i+jmp <= n; jmp++){
                    minSteps = Math.min(minSteps, qb[i+jmp]);
               }
               if(minSteps == Integer.MAX_VALUE){
                   qb[i] = Integer.MAX_VALUE;
               }else{
                   qb[i] = minSteps + 1;
               }
           }
       }
       return qb[0];
    }
}
