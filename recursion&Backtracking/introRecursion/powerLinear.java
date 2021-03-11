import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        int xn = power(x, n);
        System.out.println(xn);
    }

    public static int power(int x, int n){
        
        if(n == 0){
            return 1;
        }
        
        int xnM1 = power(x, n-1);
        int xn = x * xnM1;
        return xn;
       
    }

}
