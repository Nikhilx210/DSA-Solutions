public class Diameter {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    int height(Node node , int abc[] ) {
        // code here
        if (node == null) {
            return 0;
        } else {
            int a = (height(node.left ,abc) + 1);
            int b = (height(node.right,abc) + 1);
            int ans =Integer.max(a, b);
            if((a+b-1)>abc[0]){
                abc[0]=a+b-1;
            }
            return ans;
        }
    }
    int diameter(Node root) {
        // Your code here
        int abc[] = {-1};
        height(root, abc);
        return abc[0];
    }
}
