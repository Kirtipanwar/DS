import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            st.push(i);
        }
        while(st.size() >  1){
            int p1 = st.pop();
            int p2 = st.pop();
        
            if(arr[p1][p2] == 1){
                
                st.push(p2); //p2 can be celebrity
            } else {
                
                st.push(p1); //p1 can be celebrity
            }
        }
        int pc = st.pop(); // possible celebrity
    
        for(int c = 0; c < n; c++){
            
            if(arr[pc][c] == 1){
                
                System.out.println("None");
                return;
            }
        }
        
        for(int r = 0; r < n; r++){
            if(arr[r][pc] == 0 && r != pc){
                System.out.println("None");
                return;
            }
        }
        System.out.println(pc);
    }
}
