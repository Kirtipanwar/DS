import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][3];
        for(int i=0; i<n; i++){
            mat[i][0] = scn.nextInt();
            mat[i][1] = scn.nextInt();
            mat[i][2] = scn.nextInt();
        }
        int costR = 0;
        int costB = 0;
        int costG = 0;
        for(int i=0; i<n; i++){
            if(i == 0){
                costR = mat[0][0];
                costB = mat[0][1];
                costG = mat[0][2];
            }else{
                int red = Math.min(costB, costG) + mat[i][0];
                int blue = Math.min(costR, costG) + mat[i][1];
                int green = Math.min(costR, costB) + mat[i][2];
                
                costR = red;
                costB = blue;
                costG = green;
            }
        }
        int cost = Math.min(costR, Math.min(costB, costG));
        System.out.println(cost);
    }
}
