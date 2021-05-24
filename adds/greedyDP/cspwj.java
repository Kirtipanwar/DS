import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn= new Scanner(System.in);
      int n = scn.nextInt();
      int moves[] = new int[n];
      for(int i=0; i<n; i++){
          moves[i] = scn.nextInt();
      }
      System.out.println(countPathVariableJump(moves));
      
    }
    public static int countPathVariableJump(int moves[]){
        int n = moves.length;
        int qb[] = new int[n+1];
        for(int i=n; i>=0; i--){
            if(i==n){
                qb[n] = 1; //base case
            }else{
                int maxJmp = moves[i];
                if(maxJmp==0){
                    qb[i] = 0;
                }else{
                    for(int jmp=1; jmp <= maxJmp && jmp+i <=n ; jmp++){
                        qb[i] += qb[i+jmp];
                    }
                }
            }
        }
        return qb[0];
    }
}
