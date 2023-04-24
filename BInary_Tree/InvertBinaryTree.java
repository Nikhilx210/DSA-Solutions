import java.util.*;
public class InvertBinaryTree {
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
    public void nodeswapper(TreeNode node){
        if(node==null){
            return;
        }
        else{
            TreeNode a = node.left;
            node.left = node.right;
            node.right = a;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<> ();
        queue.add(root);
        while(queue.size()>0){
            if(queue.peek().right!=null){
                queue.add(queue.peek().right);
            }
            if(queue.peek().left!=null){
                queue.add(queue.peek().left);
            }
            nodeswapper(queue.peek());
            queue.remove();
        }
        return root;
    }
}
