import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        for (int n = n1; n <= n2; n++) {

            int cout = 0;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    cout++;
                    break;
                }
            }


            if (cout == 0) {
                System.out.println(n);
            }



        }

    }
}
