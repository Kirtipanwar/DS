import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int k = scn.nextInt();
        
        
        int cd = 0;
        int n = num;
        
        while(n != 0) {
            n = n / 10;
            cd++;
        }
        
       
        k = k % cd;
        if(k < 0) {
            k = k + cd;
        }
        
        
        int mult = (int)Math.pow(10, cd - k);
        int div = (int)Math.pow(10, k);
        
        
        int a = num / div; // first half
        int b = num % div; // second half
        
      
        int ans = (b * mult) + a;
        System.out.println(ans);

    }
}
