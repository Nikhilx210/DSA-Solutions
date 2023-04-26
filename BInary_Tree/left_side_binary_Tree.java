import java.util.*;

public class left_side_binary_Tree {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    ArrayList<Integer> leftView(Node root) {
        // Your code here
        ArrayList<Integer> finalans= new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return finalans;
        }
        Queue<Node>q1  = new LinkedList<>();
        Queue<Node>q2 = new LinkedList<>();
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
                    int a =q1.remove().data;
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
                    int a =q2.remove().data;
                    arr.add(a) ;
                }
                ans.add(arr);
            }
        }
        for( List<Integer>  i : ans ){
            finalans.add(i.get(0));
        }
        return finalans;
    }
}
