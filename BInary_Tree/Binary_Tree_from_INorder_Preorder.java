import java.util.*;
public class Binary_Tree_from_INorder_Preorder {
    public static class TreeNode {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int rootind=-1;
        for(int i=0;i<inorder.length;i++){
            if(root.val==inorder[i]){
                rootind=i;
            }
        }
        int leftind=rootind;
        int rightind=rootind;
        TreeNode leftleaf = new TreeNode(preorder[0]);
        TreeNode rightleaf = new TreeNode(preorder[0]);
        root.left=leftleaf;
        root.right=rightleaf;
        for(int i=1;i<preorder.length;i++){
            TreeNode n1 = new TreeNode(preorder[i]);
            int ind=-1;
            for(int j=0;j<inorder.length;j++){
                if(n1.val==inorder[i]){
                    ind=i;
                }
            }
            if(ind<rootind){
                if(ind<leftind){
                    leftleaf.left=n1;
                    leftind=ind;
                    leftleaf=n1;
                }
                else{
                    leftleaf.right=n1;
                }
            }
            else{
                if(ind<rightind){
                    rightleaf.left=n1;
                    
                }
                else{
                    rightleaf.right=n1;
                    rightind=ind;
                    rightleaf=n1;
                }
            } 
        }
        root.left=root.left.left;
        root.right=root.right.right;
        return root;
    }
}
