import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Reversal_order {
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
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<> ();
        queue.add(node);
        while(queue.size()>0){
            if(queue.peek().right!=null){
                queue.add(queue.peek().right);
            }
            if(queue.peek().left!=null){
                queue.add(queue.peek().left);
            }
            int a =queue.remove().data;
            ans.add(a);
        }
        for(int i=0;i<ans.size()/2;i++){
            int temp = ans.get(i);
            ans.set(i,ans.get(ans.size()-1-i));
            ans.set(ans.size()-1-i,temp);
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
