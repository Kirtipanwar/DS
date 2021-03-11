import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = 1;
        int space = n / 2;

        for (int r = 0; r < n; r++) {
           
            
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("	");
            }
           
            for (int st = 1; st <= star; st++) {
                System.out.print("*	");
            }
            
            System.out.println();

            
            if (r < n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
        }
    }
}
