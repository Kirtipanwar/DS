import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][] a1 = new int[n1][m1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                a1[i][j] = scn.nextInt();
            }
        }
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] a2 = new int[n2][m2];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[0].length; j++) {
                a2[i][j] = scn.nextInt();
            }
        }

        if (a1[0].length != a2.length) {
            System.out.println("Invalid input");
            return;
        }

        int[][] ans = new int[a1.length][a2[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {

                int val = 0;

                for (int k = 0; k < a1[0].length; k++) {

                    val = val + (a1[i][k] * a2[k][j]);
                }
                ans[i][j] = val;
            }

        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
