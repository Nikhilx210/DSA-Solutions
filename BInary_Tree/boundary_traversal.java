import java.util.*;

public class boundary_traversal {
    class Node  
    { 
        int data; 
        Node left, right; 
    
        public Node(int d)  
        { 
            data = d; 
            left = right = null; 
        } 
    }
    public static void leafchecker(Node node , ArrayList <Integer>leaf){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            leaf.add(node.data);
            return;
        }
        else{
            leafchecker(node.left, leaf);
            leafchecker(node.right, leaf);
        }
    }
    ArrayList <Integer> boundary(Node node){
	    ArrayList <Integer> ans = new ArrayList<>();
        ans.add(node.data);
        Node a= node.left;
        if(a!=null){
            while(a.left!=null || a.right!=null){
                ans.add(a.data);
                if(a.left!=null){
                    a=a.left;
                }
                else if(a.right!=null){
                    a=a.right;
                }
            }
        }
        ArrayList <Integer> leaf = new ArrayList<>();
        leafchecker(node, leaf);
        ans.addAll(ans.size(), leaf);
        ArrayList <Integer> right = new ArrayList<>();
        a= node.right;
        if(a!=null){
            while(a.right!=null ||a.left!=null){
                right.add(a.data);
                if(a.right!=null){
                    a=a.right;
                }
                else if(a.left!=null){
                    a=a.left;
                }
            }
            for(int i=0;i<right.size()/2;i++){
                int swap=right.get(i);
                right.set(i, right.get(right.size()-1-i));
                right.set(right.size()-1-i,swap);
            }
            ans.addAll(ans.size(), right);
        }
        return ans;

	}
}
