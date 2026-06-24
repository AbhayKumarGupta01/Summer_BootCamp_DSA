// Max Depth of a Binary Tree
import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class Max_Depth {

    static TreeNode root = null;

    // Insert level-wise
    public static TreeNode insert(TreeNode root, int data) {
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

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        for (int x : arr) {
            root = insert(root, x);
        }

        System.out.println("Maximum Depth: " + maxDepth(root));
    }
}