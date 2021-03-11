import java.io.*;
import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }

    int size() {
     
      return mainQ.size();
    }

    void push(int val) {
     
      helperQ.add(val);
      
      //moving elements from mainQ to helperQ
      while(mainQ.size() > 0){
          helperQ.add(mainQ.remove());
      }
      
      //ref swapping
      Queue<Integer> tempQ = helperQ;
      helperQ = mainQ;
      mainQ = tempQ;
    }

    int pop() {
      
      if(size() == 0){
          System.out.println("Stack underflow");
          return -1;
      }else {
          return mainQ.remove();
      }
    }
       

    int top() {
      
       if(size() == 0){
          System.out.println("Stack underflow");
          return -1;
      }else {
          return mainQ.peek();
      }
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}
