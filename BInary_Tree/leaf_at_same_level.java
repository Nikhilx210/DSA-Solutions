import java.util.*;

public class leaf_at_same_level {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    boolean leaf(Node root,int hieght,int maxh[]){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            if(maxh[0]!=-1){
                if(hieght!=maxh[0]){
                    return false;
                }
            }else{
                maxh[0]=hieght;
                return true;
            }
        }
        if(leaf(root.left, hieght+1, maxh) && leaf(root.right, hieght+1, maxh)){
            return true;
        }
        return false;
    }
    boolean check(Node root) {
        int maxh[]={-1};
        return leaf(root, 0, maxh);
    }
}
