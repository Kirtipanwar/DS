import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        String exp = scn.nextLine();
        
        System.out.println(isBalanced(exp));
        
    }
    
    public static boolean isBalanced(String exp){
        
        Stack<Character> st = new Stack<>();
        
        for(int idx = 0; idx < exp.length(); idx++){
            char ch = exp.charAt(idx);
            
            if(ch == '{' || ch == '(' || ch == '[' ){
                st.push(ch);
                
            } else if(ch == '}' || ch == ')' || ch == ']' ){
                //////////////////////////////////////////////////////////////////////
                
                if(st.size()==0){
                    return false;
                }
                
                if((ch == ')' && st.peek()!= '(') 
                || (ch == '}' && st.peek()!= '{') 
                || (ch == ']' && st.peek()!= '[')){
                    return false;
                    
                } else{
                    st.pop();
                }
                ///////////////////////////////////////////////////////////////////////
            }
        }
        if(st.size() > 0){
            return false;
        }
        return true;
    }
}
    
