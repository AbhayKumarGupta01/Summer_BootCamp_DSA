// Preorder of a binary tree
import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    
}
class PreOrder{
     static TreeNode root = null;

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

    static void Preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
       // return root;
    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            root = insertNode(sc.nextInt(), root);
        }
        Preorder(root);

    }
}