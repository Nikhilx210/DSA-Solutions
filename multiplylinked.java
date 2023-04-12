public class multiplylinked {
    class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}
    public long multiplyTwoLists(Node l1,Node l2){
        //add code here.
        Node a = l1.next;
        Node b = l2.next;
        long p =l1.data ;
        long q =l2.data ;
        long i =1;
        long j =1;
        while(a!=null){
            p = p *10+a.data;
            a=a.next;
        }
        while(b!=null){
            q = q * 10+b.data;
            b=b.next;
        }
        long ans =p*q;
        return ans;
    }
}
