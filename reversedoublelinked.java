public class reversedoublelinked {
    class Node
    {
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node reverseDLL(Node  head){
    //Your code here
    if(head.next==null || head==null){
        return head;
    }
        Node a =head;
    Node b =head;
        while(b.next!=null){
            b=b.next;
        }
        while(a.next!=b && a.next.next!=b ){
            int temp = a.data;
            a.data=b.data;
            b.data=temp;
            a=a.next;
            b=b.prev;
        }
            int temp = a.data;
            a.data=b.data;
            b.data=temp;
        return head;
    }

    
}
