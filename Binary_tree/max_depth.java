public class max_depth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int l = 1;
        int r = 1;
        if (root.left != null) {
            l = maxDepth(root.left) + 1;
        }
        if (root.right != null) {
            r = maxDepth(root.right) + 1;
        }
        return (Integer.max(l, r));
    }
}
