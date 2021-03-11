import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int r = 0; r < n; r++) {
            for (int c = 0; c <= r; c++) {
                if (r == c) {
                    System.out.println("*	");
                } else {
                    System.out.print("	");
                }
            }
        }
    }
}
