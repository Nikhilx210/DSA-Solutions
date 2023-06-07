public class flattenlinkedlist {
    class Node {
            int val;
            Node next;
            Node child;
        };
    Node flatten(Node head) {
        Node a= head;
        Node b =head;
        while(b.child==null){
            b=b.next;
        }
        while(b.next!=null || b.child!=null){
            while(a.next!=null){
                a=a.next;
            }
            a.next=b.child;
            b=b.next;
            while(b.child==null){
                b=b.next;
            }
        }
        return head;
    }
}
