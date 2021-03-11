import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int power = 1;

        int temp = n;

        while (temp >10) {

            
            temp = temp / 10;
            power = power * 10;
        }


        while(power >0) {
            
            int fv = n/power;

            System.out.println(fv);
            
            n = n%power;
            power = power/10;
        }
    }
}
