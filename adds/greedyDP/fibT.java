import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fibT(n));
 }
 public static int fibT(int n){
    int qb[] = new int[n+1];
    for(int i=0; i<=n; i++){
        if(i==0){
            qb[i]=0;
        }else if(i==1){
            qb[i]=1;
        }else{
            qb[i]=qb[i-1]+qb[i-2];
        }
    }
    return qb[n];
 }

}
