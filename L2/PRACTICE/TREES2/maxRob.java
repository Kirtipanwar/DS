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
    public static class HRPair{
        int withRobbery;
        int withoutRobbery;
        HRPair(int withRobbery, int withoutRobbery){
            this.withRobbery = withRobbery;
            this.withoutRobbery = withoutRobbery;
        }
    }

    public static int HouseRobber(TreeNode root) {
        HRPair res = HouseRobberHelper(root);
        return Math.max(res.withRobbery, res.withoutRobbery);
    }
    
    public static HRPair HouseRobberHelper(TreeNode root){
        if(root == null){
            return new HRPair(0,0);
        }
        
        HRPair left = HouseRobberHelper(root.left);
        HRPair right = HouseRobberHelper(root.right);
        
        int withRobbery = root.val + left.withoutRobbery + right.withoutRobbery;
        int withoutRobbery = Math.max(left.withRobbery, left.withoutRobbery) + Math.max(right.withRobbery, right.withoutRobbery);
        
        return new HRPair(withRobbery, withoutRobbery);
    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
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
        System.out.println(HouseRobber(root));
    }

    public static void main(String[] args) {
        solve();
    }
}
