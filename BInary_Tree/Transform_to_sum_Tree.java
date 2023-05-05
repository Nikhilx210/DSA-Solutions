public class Transform_to_sum_Tree {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    int findsum (Node node){
        if(node==null  ){
            return 0;
        }
        else if(node.left==null && node.right==null){
            node.data=0;
            return 0;
        }
        else if(node.left==null && node.right!=null){
            node.data=(node.right.data + findsum(node.right));
            return node.data;
        }
        else if(node.right==null && node.left!=null){
            node.data=(node.left.data + findsum(node.left));
            return node.data;
        }
        else{
            node.data=(node.left.data + node.right.data + findsum(node.left) + findsum(node.right));
            return node.data;
        }
    }
    public void toSumTree(Node root){
        //add code here.
        findsum(root);
   }
}
