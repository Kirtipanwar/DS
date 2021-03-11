import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();


        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;

        int total = n * m;
        int count = 0;

        while (count < total) {

            for (int i = minrow, j = mincol; i <= maxrow && count < total; i++) {
                System.out.println(arr[i][j]);
                count++;
            }

            mincol++;


            for (int i = maxrow, j = mincol; j <= maxcol && count < total; j++) {
                System.out.println(arr[i][j]);
                count++;
            }

            maxrow--;

            for (int i = maxrow, j = maxcol; i >= minrow && count < total; i--) {
                System.out.println(arr[i][j]);
                count++;
            }

            maxcol--;


            for (int i = minrow, j = maxcol; j >= mincol && count < total; j--) {
                System.out.println(arr[i][j]);
                count++;
            }

            minrow++;

        }
    }
}
