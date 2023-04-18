public class check_for_isomorphic_tree {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    boolean treechecker(Node sample , Node subRoot){
        boolean a= false;
        boolean b= false;
        if(sample==null && subRoot==null){
            return true;
        }
        if(sample==null || subRoot==null){
            return false;
        }
        else if(sample.data==subRoot.data){
            a = treechecker(sample.left, subRoot.left) && treechecker(sample.right, subRoot.right);
            b = treechecker(sample.left, subRoot.right) && treechecker(sample.right, subRoot.left);
        }
        return a || b;
    }
    boolean isIsomorphic(Node root1, Node root2)  
    { 
        // code here.
        return treechecker(root1, root2);

    }
}
