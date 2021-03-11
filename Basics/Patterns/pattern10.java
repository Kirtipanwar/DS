import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        n--;

        for (int r = 0; r <= n; r++) {
            for (int c = 0; c <= n; c++) {
                if (r + c == n / 2) {
                    System.out.print("*	");
                } else if (r + c == (n + n / 2)) {
                    System.out.print("*	");
                } else if (c - r == n / 2) {
                    System.out.print("*	");
                } else if (r - c == n / 2) {
                    System.out.print("*	");
                } else {
                    System.out.print("	");
                }
            }
            System.out.println();
        }
    }
}
