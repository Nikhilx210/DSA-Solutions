public class intersectionpoint {
    class Node {
        int data;
         Node next;
         Node(int d)  { data = d;  next = null; }
    }
    int intersectPoint(Node head1, Node head2)
	{
        // code here
        Node a = head1;
        int l1=1;
        Node b =head2;
        int l2=1;
        while(a.next!=null){
            a=a.next;
            l1+=1;
        }
        while(b.next!=null){
            b=b.next;
            l2+=1;
        }
        if(a!=b){
            return -1;
        }
        int nextcnt = Math.abs(l2-l1);
        if(l1>l2){
            a=head1;
            b=head2;
        }
        else{
            a=head2;
            b=head1;
        }
        while(nextcnt!=0){
            a=a.next;
            nextcnt--;
        }
        while(a!=b){
            a=a.next;
            b=b.next;
        }
        return a.data;
	}
}
