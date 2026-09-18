import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        data = val;
    }
}
public class maxDepth{
    public static TreeNode insertNode(int data, TreeNode root) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            return newNode;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left == null) {
                temp.left = newNode;
                return root;
            } else {
                q.offer(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return root;
            } else {
                q.offer(temp.right);
            }
        }
        return root;
    }
    public static int maxDepthofTree(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepthofTree(root.left), maxDepthofTree(root.right));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            root = insertNode(sc.nextInt(), root);
        }
        System.out.println("Max Depth of Tree is: " + maxDepthofTree(root));
    }
}