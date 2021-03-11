import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int st = scn.nextInt();
        int dt = scn.nextInt();
        int ht = scn.nextInt();
        
        toh(n, st, dt, ht);
    }

    public static void toh(int n, int st, int dt, int ht){
        
        if(n == 0){
            return;
        }
        
        toh(n-1, st, ht, dt);
        System.out.println(n + "["+ st + " -> " + dt+"]");
        toh(n-1, ht, dt, st);
        
    }

}
