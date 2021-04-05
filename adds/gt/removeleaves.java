public static void removeLeaves(Node node){
    for(int idx = node.children.size()-1; idx>=0; idx--){
        Node child = node.children.get(idx);
        if(child.children.size() == 0){
            node.children.remove(idx);
        }
    }
    for( Node child : node.children){
        removeLeaves(child);
    } 
}
