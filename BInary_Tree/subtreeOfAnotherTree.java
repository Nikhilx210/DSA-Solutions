import java.util.*;
import java.util.Queue;

public class subtreeOfAnotherTree {
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
        else if(sample.val==subRoot.val){
            a = treechecker(sample.left, subRoot.left) && treechecker(sample.right, subRoot.right);
        }
        return a;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        Queue<TreeNode> queue = new LinkedList<> ();
        Boolean ans = false;
        queue.add(root);
        while(queue.size()>0){
            if(queue.peek().right!=null){
                queue.add(queue.peek().right);
            }
            if(queue.peek().left!=null){
                queue.add(queue.peek().left);
            }
            if(queue.peek().val==subRoot.val){
                TreeNode a = queue.peek();
                ans = treechecker(a,subRoot);
                if(ans){
                    break;
                }
            }
            queue.remove();
        }

        return ans;

    }
}
