import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
        System.out.println(gss(str));
    }
        
    public static ArrayList<String> gss(String str){
        
        if(str.length() == 0){
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rres = gss(ros);
        ArrayList<String> myList = new ArrayList<>();
        
        for(String s : rres){
            myList.add(s);
        }
        
        for(String s : rres){
            myList.add(ch + s);
        }
        return myList;
    }
}
