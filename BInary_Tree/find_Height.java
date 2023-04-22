public class find_Height {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    int height(Node node) {
        // code here
        if (node == null) {
            return 0;
        } else {
            int a = (height(node.left) + 1);
            int b = (height(node.right) + 1);
            return Integer.max(a, b);
        }
    }
}
