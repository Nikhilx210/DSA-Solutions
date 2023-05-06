import java.util.*;

public class zig_zagTraversal {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    ArrayList<Integer> zigZagTraversal(Node root) {
        Stack<Node> q1 = new Stack<>();
        Stack<Node> q2 = new Stack<>();
        ArrayList<Integer> finalans= new ArrayList<>();
        if(root==null){
            return finalans;
        }
        q1.push(root);
        while(q1.size()>0 || q2.size()>0){
            if(q1.size()!=0){

                while(q1.size()>0){
                    if(q1.peek().left!=null){
                        q2.push(q1.peek().left);
                    }
                    if(q1.peek().right!=null){
                        q2.push(q1.peek().right);
                    }
                    int a =q1.pop().data;
                    finalans.add(a) ;
                }
            }
            else{
                while(q2.size()>0){
                    if(q2.peek().right!=null){
                        q1.push(q2.peek().right);
                    }
                    if(q2.peek().left!=null){
                        q1.push(q2.peek().left);
                    }
                    int a =q2.pop().data;
                    finalans.add(a) ;
                }
            }
        }
        return finalans;
    }
}
