import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(countStairPaths(n));
    }
    public static int countStairPaths(int n){
        int qb[] = new int[n+1];
        for(int i=0; i<=n; i++){
            if(i==0){
                qb[0] = 1;
            }else if(i==1){
                qb[i] = qb[i-1]; 
            }else if(i==2){
                qb[i] = qb[i-1]+qb[i-2];
            }else{
                qb[i] = qb[i-1]+qb[i-2]+qb[i-3];
            }
        }
        return qb[n];
    }
}
