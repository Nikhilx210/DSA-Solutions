public class Same_tree {
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
    boolean treechecker(TreeNode sample , TreeNode subRoot){
        boolean a= false;
        if(sample==null && subRoot==null){
            return true;
        }
        if(sample==null || subRoot==null){
            return false;
        }
        else if(sample.val==subRoot.val){
            a = treechecker(sample.left, subRoot.left) && treechecker(sample.right, subRoot.right);
        }
        return a;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return treechecker(p, q);
    }
}
