import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[][] = new int[2][n+1];
        for(int len=1; len <= n; len++){
            if(len==1){
                dp[0][1] = dp[1][1] = 1;
            }else{
                dp[0][len] = dp[1][len-1];
                dp[1][len] = dp[1][len-1] + dp[0][len-1];
            }
        }
        System.out.println(dp[0][n] + dp[1][n]);
    }
}
--------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int countEnd0 = 1;
        int countEnd1 = 1;
        for(int len = 2; len <= n; len++){
            int tmp0 = countEnd1;
            int tmp1 = countEnd1 + countEnd0;
            
            countEnd0 = tmp0;
            countEnd1 = tmp1;
        }
        System.out.println(countEnd0 + countEnd1);
    }
}

  
