import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String inp = scn.nextLine();
        
        System.out.println(getKPC(inp));
    }
    
    static String keypad[] = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
    
    public static ArrayList < String > getKPC(String str) {
        if(str.length()==0){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        
        int idx = Integer.parseInt(ch+"");
        String word = keypad[idx];
        
        ArrayList<String>myList = new ArrayList<>();
        for(int i=0; i<word.length(); i++){
            for(String tmp : rres){
                myList.add(word.charAt(i)+tmp);
            }
        }
        return myList;
    }

}
