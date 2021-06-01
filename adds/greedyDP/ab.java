import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int ob = 1;
    int os = 1;
    
    for(int i = 2; i<= n; i++){
        int nb = os;
        int ns = os + ob;
        
        os = ns;
        ob = nb;
    }
    int total = os + ob;
    total = total * total;
    System.out.println(total);
 }
}
//---------------------------------------------------for long range constraints----------------------------
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();
    
    long ob = 1;
    long os = 1;
    
    for(int i = 2; i<= n; i++){
        long nb = os;
        long ns = os + ob;
        
        os = ns;
        ob = nb;
    }
    long total = os + ob;
    total = total * total;
    System.out.println(total);
 }
}
