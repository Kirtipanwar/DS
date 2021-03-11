import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int temp1 = n1;
        int temp2 = n2;
        
        //gcd
        while(n2%n1 != 0){
            int rem = n2%n1;
            n2 = n1;
            n1 = rem;
        }
        int gcd = n1;
        
        //lcm
        
        int lcm = (temp1*temp2)/gcd;
        
        System.out.println(gcd+"
"+lcm);
        
    }
}
