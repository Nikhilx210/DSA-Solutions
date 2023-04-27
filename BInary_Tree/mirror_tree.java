import java.util.*;

public class mirror_tree {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public void nodeswapper(Node node) {
        if (node == null) {
            return;
        } else {
            Node a = node.left;
            node.left = node.right;
            node.right = a;
        }
    }

    void mirror(Node node) {
        // Your code here
        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size() > 0) {
            if (queue.peek().right != null) {
                queue.add(queue.peek().right);
            }
            if (queue.peek().left != null) {
                queue.add(queue.peek().left);
            }
            nodeswapper(queue.peek());
            queue.remove();
        }
        return;

    }
}
