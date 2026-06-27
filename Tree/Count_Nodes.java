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
class Count_Nodes{
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

   public int countNodes(TreeNode root) {

    if (root == null)
        return 0;

    return 1 + countNodes(root.left) + countNodes(root.right);
}
    public static void  main(String[] args){
        Count_Nodes obj = new Count_Nodes();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            root = insertNode(sc.nextInt(), root);
        }
        System.out.println("Total Nodes: " + obj.countNodes(root));

    }
}