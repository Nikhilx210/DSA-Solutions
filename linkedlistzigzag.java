public class linkedlistzigzag {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node zigZag(Node head){
        //add code here.
        Node a = head;
        Node b = head.next;
        Node c = head.next.next;
        while(c!=null || b!=null){
            int max;
            if(a.data>b.data && a.data>c.data){
                max=a.data;
            }
            else if(b.data>a.data && b.data>c.data){
                max=b.data;
            }
            else{
                max=c.data;
            }
            
            if(max==a.data){
                int temp =a.data;
                a.data =b.data;
                b.data=temp;
            }
            else if (max==b.data){
                continue;
            }
            else {
                int temp =c.data;
                c.data =b.data;
                b.data=temp;
            }
            a=c;
            b=a.next;
            c=b.next;
        }
        if(c==null){
            if(b.data<a.data){
                int temp =a.data;
                a.data =b.data;
                b.data=temp;
            }
        }
        return head;
        
    }
}
