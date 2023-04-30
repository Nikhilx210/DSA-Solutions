import java.util.*;

public class Right_side_binary {
    class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        List<List<Integer>> a=new ArrayList<>();
        q.add(root);
        int s=q.size();
        int num=0;
        List<Integer> l=new ArrayList<>();
        while(q.size()>0){
            Node temp=q.remove();
            if(temp==null){
                break;
            }
            l.add(temp.data);
            num++;
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(num==s){
                num=0;
                a.add(new ArrayList<>(l));
                l.clear();
                s=q.size();
            }
            
        }
        for( List<Integer>  i : a ){
            ans.add(i.get(i.size()-1));
        }
        return ans;
    }
}
