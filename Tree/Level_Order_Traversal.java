// Level Order Traversal of Binary Tree

import java.util.*;

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Level_Order_Traversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int levelnum = q.size();
            List<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < levelnum; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                sublist.add(q.poll().data);
            }
            ans.add(sublist);
        }
        return ans;
    }

    public static void main(String[] args) {
        Level_Order_Traversal obj = new Level_Order_Traversal();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = insertNode(sc.nextInt(), root);
        }
        System.out.println(obj.levelOrder(root));
    }
}
