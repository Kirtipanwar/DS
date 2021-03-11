import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int star = n;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <=star; c++) {
                System.out.print("*	");
            }
            System.out.println();
            star--;
        }

    }
}
