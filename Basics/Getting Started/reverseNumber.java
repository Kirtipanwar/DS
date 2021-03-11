import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here 
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while (n > 0){
            
            int lv = n%10;
            
            System.out.println(lv);
            
            n=n/10;
        }

    }
}
