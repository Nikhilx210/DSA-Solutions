import java.util.*;
import java.util.Stack;

public class reverse_level_order_traversal {
    class Node
    {
        int data;
        Node left, right;
    
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    public ArrayList<Integer> reverseLevelOrder(Node node ) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while(stack.size()>0){
            if(stack.peek().left!=null){
                stack.push(stack.peek().left);
            }
            else if(stack.peek().right!=null){
                stack.push(stack.peek().right);
            }
            else (stack.peek().left==null && stack.peek().right==null){
                int a =stack.pop().data;
                ans.add(a);
            }
        }
        return ans;
    }
}
