import java.util.*;

class AverageOfLevels {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] arr) {

        if (arr.length == 0 || arr[0] == -1)
            return null;

        TreeNode root = new TreeNode(arr[0]);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {

            TreeNode current = q.poll();

            // Left
            if (i < arr.length && arr[i] != -1) {
                current.left = new TreeNode(arr[i]);
                q.add(current.left);
            }
            i++;

            // Right
            if (i < arr.length && arr[i] != -1) {
                current.right = new TreeNode(arr[i]);
                q.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

            ans.add(sum / size);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = buildTree(arr);

        System.out.println(averageOfLevels(root));

        sc.close();
    }
}