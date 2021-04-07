public static boolean find(Node node, int val){
    if(node == null) return false;
    if(node.data == val) return true;
    if(find(node.left, val)) return true;
    if(find(node.right, val)) return true;
    return false;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int val){
      if(node == null){
          return new ArrayList<Integer>();
      }
      if(node.data == val){
          ArrayList<Integer> base = new ArrayList<Integer>();
          base.add(val);
          return base;
      }
      ArrayList<Integer> Lrres = nodeToRootPath(node.left, val);
      if(Lrres.size() > 0){
          Lrres.add(node.data);
          return Lrres;
      }
      ArrayList<Integer> Rrres = nodeToRootPath(node.right, val);
      if(Rrres.size() > 0){
          Rrres.add(node.data);
          return Rrres;
      }
      return new ArrayList<Integer>();
  }
