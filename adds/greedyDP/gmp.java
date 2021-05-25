import java.util.*;
import java.io.*;
public class Main{
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
 	    int nr = sc.nextInt();
 	    int nc = sc.nextInt();
 	    int[][] mine = new int[nr][nc];
 	    for(int i = 0; i < nr; i++){
 	        
 	        for(int j = 0; j < nc; j++) {
 	            
 	            mine[i][j] = scn.nextInt();
 	        }
        }
        System.out.println(maxGold(mine));
    }
 	public static int maxGold(int mine[][]){
 	    int nr = mine.length;
 	    int nc = mine[0].length;
 	    int dp[][] = new int[nr][nc];
 	    
 	    for(int c=nc-1; c>=0; c--){
 	        for(int r=0; r<nr; r++){
 	            if(c === nc-1){
 	                dp[r][c] = mine[r][c];
 	            }else{
 	                if(r == 0){
 	                    dp[r][c] = Math.max(dp[r][c+1], dp[r+1][c+1]) + mine[r][c];
 	                }else if(r == nr-1){
 	                    dp[r][c] = Math.max(dp[r][c+1], dp[r-1][c+1]) + mine[r][c];
 	                }else{
 	                    dp[r][c] = Math.max(dp[r][c+1], Math.max(dp[r-1][c+1], dp[r+1][c+1])) + mine[r][c];
 	                }
 	            }
 	        }
 	    }
 	    int max = Integer.MIN_VALUE;
 	    for(int r=0; r<nr; r++){
 	        max = Math.max(max, dp[r][0]);
 	    }
 	    return max;
 	}
 }
----------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------
 import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt() , nc = scn.nextInt();
        
        int mine[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mine[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(maxGold(mine));
    }
    public static int maxGold(int mine[][]){
        int nr = mine.length , nc = mine[0].length;
        int dp[][] = new int[nr][nc];
        
        for(int c = nc-1 ; c>=0 ; c--){
            for(int r = 0 ; r < nr ; r++){
                if(c == nc-1){
                    dp[r][c] = mine[r][c];
                }else{
                    int du = (r-1 >= 0) ? dp[r-1][c+1] : 0;
                    int dd = (r+1 < nr) ? dp[r+1][c+1] : 0;
                    dp[r][c] = Math.max(dp[r][c+1],Math.max(du,dd)) + mine[r][c];
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int r = 0 ; r < nr ;r++){
            max = Math.max(max,dp[r][0]);
        }
        
        return max;
    }

}
