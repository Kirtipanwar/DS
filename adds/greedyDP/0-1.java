import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int vls[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            vls[i] = scn.nextInt();
        }
        int wts[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        
        System.out.println(zeroOneKnapsack(wts,vls,cap));
        
    }
    
    public static int zeroOneKnapsack(int wts[],int vls[],int cap){
        int dp[][] = new int[wts.length+1][cap+1];
        
        for(int i=1; i <= wts.length; i++){
            int wt = wts[i-1], vl = vls[i-1];
            for(int j=1; j <= cap; j++){
               int exc = dp[i-1][j];
               int inc = (j - wt >= 0) ? (vl + dp[i-1][j-wt]) : 0;
               dp[i][j] = Math.max(exc, inc);
            }
        }
        return dp[vls.length][cap];
    }
}
