import java.util.Scanner;

public class Main {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }
  
  public static class Pair{
      int NTLMS, LTLMS;
      Pair(int a, int b){
          NTLMS = a;
          LTLMS = b;
      }
  }

  public static int maxPathSum(TreeNode root) {
    return maxPathSumHelper(root).LTLMS;
  }
  public static Pair maxPathSumHelper(TreeNode node){
      if(node == null){
          return new Pair(0,0);
      }
      
      Pair lpair = maxPathSumHelper(node.left);
      Pair rpair = maxPathSumHelper(node.right);
      
      int NTLMS = Math.max(lpair.NTLMS, rpair.NTLMS)+node.val;
      int LTLMS = Math.max(lpair.LTLMS, rpair.LTLMS);
      if(node.left != null && node.right != null){
          LTLMS = Math.max(LTLMS, lpair.NTLMS+node.val+rpair.NTLMS);
      }
      return new Pair(NTLMS,LTLMS);
  }

  public static TreeNode createTree(int[] arr, int[] IDX) {
    if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
      IDX[0]++;
      return null;
    }

    TreeNode node = new TreeNode(arr[IDX[0]++]);
    node.left = createTree(arr, IDX);
    node.right = createTree(arr, IDX);

    return node;
  }

  public static void solve() {
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = scn.nextInt();

    int[] IDX = new int[1];
    TreeNode root = createTree(arr, IDX);
    System.out.println(maxPathSum(root));
  }

  public static void main(String[] args) {
    solve();
  }
}
