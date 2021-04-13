 static int tilt = 0;
  public static int tilt(Node node){
   
    if(node==null)
    {
        return;
    }
    int ls = tilt(node.left);
    int rs = tilt(node.right);
    
    tilt += Math.abs(ls-rs);
    return ls+rm+node.data;
    
  }
