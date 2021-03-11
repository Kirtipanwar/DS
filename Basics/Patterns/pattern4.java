import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = n;
        int space = 0;

        for (int r = 1; r <= n; r++) {
            
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("	");
            }
            
            for (int st = 1; st <= star; st++) {
                System.out.print("*	");
            }
           
            System.out.println();
            
            space++;
            star--;
        }

    }
}
