 public static void levelOrder(Node node){
    
    Queue<Node> q = new ArrayDeque<>();
    
    q.add(node);
    
    while(q.size() > 0 ){
        node = q.remove();
        System.out.print(node.data + " ");
        
        for(Node child : node.children){
            q.add(child);
        }
    }
    System.out.print(".");
  }
//linearwise
public static void levelOrderLinewise(Node root){

    Queue<Node> mainQ = new ArrayDeque<>();
    Queue<Node> helperQ = new ArrayDeque<>();
    
    mainQ.add(root);
    
    while(mainQ.size() > 0){
        Node frontNode = mainQ.remove();
        
        System.out.print(frontNode.data+" ");
        
        for(Node child : frontNode.children){
            helperQ.add(child);
        }
        
        if(mainQ.size() == 0){
            System.out.println();
            
            Queue<Node> tempQ = mainQ;
            mainQ = helperQ;
            helperQ = tempQ;
        }
    }
    
  }
//zigzag
public static void levelOrderLinewiseZZ(Node node){
    
    Stack<Node> mainS = new Stack<Node>();
    Stack<Node> helperS = new Stack<Node>();
    
    mainS.push(node);
    int level = 1;
    
    while(mainS.size() > 0){
        
        node = mainS.pop();
        System.out.print(node.data + " ");
        
        if(level % 2 == 1){
            for(int i=0; i<node.children.size(); i++){
                Node child = node.children.get(i);
                helperS.push(child);
            }
        }else{
            for(int i=node.children.size()-1; i>=0; i--){
                Node child = node.children.get(i);
                helperS.push(child);
            }
            
        }
        if(mainS.size() == 0){
            
            mainS = helperS;
            helperS = new Stack<>();
            level++;
            System.out.println();
        }
    }
  }
