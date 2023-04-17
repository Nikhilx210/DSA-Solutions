public class check_for_balanced_tree {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    int findheight(Node root){
        if(root==null){
            return 0;
        }
        else{
            int a =(findheight(root.left)+1);
            int b =(findheight(root.right)+1);
            if(a<0 || b<0){
                return -100;
            }
            if(Math.abs(a-b)<=1){
                return -100;
            }
            return Integer.max(a,b);
        }
    }
    boolean isBalanced(Node root) {
        if(root==null){
            return true;
        }
        // Your code here
        int a =(findheight(root.left)+1);
        int b =(findheight(root.right)+1);
        if(a<0 || b<0){
            return false;
        }
        if(Math.abs(a-b)<=1){
            return true;
        }
        return false;
    }
}
