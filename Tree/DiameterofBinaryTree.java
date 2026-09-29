import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class DiameterofBinaryTree {

    static int diameter = 0;

    public static int diameterofbinarytree(TreeNode root) {
        height(root);
        return diameter;
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        diameter = Math.max(diameter, leftheight + rightheight);

        return 1 + Math.max(leftheight, rightheight);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = buildTree(arr);

        System.out.println(diameterofbinarytree(root));
    }
}