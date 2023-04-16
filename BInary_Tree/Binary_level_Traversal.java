import java.util.*;
public class Binary_level_Traversal {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode>q1  = new LinkedList<>();
        Queue<TreeNode>q2 = new LinkedList<>();
        q1.add(root);
        while(q1.size()>0 || q2.size()>0){
            if(q1.size()!=0){
                List<Integer> arr = new ArrayList<>();
                while(q1.size()>0){

                    if(q1.peek().left!=null){
                        q2.add(q1.peek().left);
                    }
                    if(q1.peek().right!=null){
                        q2.add(q1.peek().right);
                    }
                    int a =q1.remove().val;
                    arr.add(a) ;
                }
                ans.add(arr);
            }
            else{
                List<Integer> arr = new ArrayList<>();
                while(q2.size()>0){

                    if(q2.peek().left!=null){
                        q1.add(q2.peek().left);
                    }
                    if(q2.peek().right!=null){
                        q1.add(q2.peek().right);
                    }
                    int a =q2.remove().val;
                    arr.add(a) ;
                }
                ans.add(arr);
            }
        }
        return ans;
    }
}
