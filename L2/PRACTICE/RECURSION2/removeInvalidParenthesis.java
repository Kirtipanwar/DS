import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String exp, int minRemoval, HashSet<String> ans) {
		if(minRemoval == 0){
		    if(getMin(exp) == 0 && ans.contains(exp) == false){
		        System.out.println(exp);
		        ans.add(exp);
		    }
		    return;
		}
		StringBuilder sb = new StringBuilder(exp);
		for(int i = 0; i < exp.length(); i++){
		    sb.deleteCharAt(i);
		    String ros = sb.toString();
		    solution(ros,minRemoval-1,ans);
		    sb.insert(i,exp.charAt(i));
		}
	}

	public static int getMin(String exp){
	    Stack<Character> st = new Stack<>();
	    
	    for(int i = 0; i < exp.length(); i++){
	        char ch = exp.charAt(i);
	        
	        if(ch == '('){
	            st.push(ch);
	        }else if(ch == ')'){
	            if(st.size() == 0){
	                st.push(ch);
	            }else if(st.peek() == '('){
	                st.pop();
	            }else if(st.peek() == ')'){
	                st.push(ch);
	            }
	        }
	    }
	    return st.size();
	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str, getMin(str),new HashSet<>());
	}
}
