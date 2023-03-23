public class deletenodehavinggrtval {
    class Node {
        int data;
        Node next;
     
       Node(int data) {
           this.data = data;
       }
     }
     public Node reverseList(Node head) {
        if(head==null){
            return head;
        }
        Node a = head;
        Node b = null;
        Node c = head.next;
        while(a.next!=null){
            a.next=b;
            b=a;
            a=c;
            c=a.next;
        }
        a.next=b;
        head =a;
        return head;
    }
    Node compute(Node head)
    {
        // your code here
        reverseList(head);
        Node a =head;
        Node b =head.next; 
        while(b!=null){
            if(b.data<a.data){
                a.next=b.next;
                b=b.next;
            }
            else{
                a=a.next;
                b=b.next;
            }
        }
        reverseList(head);
        return head;


    }
}
