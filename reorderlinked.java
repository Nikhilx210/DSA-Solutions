public class reorderlinked {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode a = head;
        ListNode b = null;
        ListNode c = head.next;
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
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ListNode a=head;
        int len=1;
        while(a.next!=null){
            a=a.next;
            len+=1;
        }
        if(len==1 || len==2){
            return;
        }
        int mid;
        if(len%2==0){
            mid=len/2;
        }
        else{
            mid=len/2;
        }
        a=head;
        ListNode head2 =head.next;
        while(mid!=0){
            a=head2;
            head2=head2.next;
            mid--;
        }
        a.next=null;
        head2 = reverseList(head2);
        a=head;
        ListNode c=a.next;
        ListNode b =head2;
        ListNode d =b.next;
        while(b!=null){
            a.next=b;
            b.next=c;
            a=c;
            c=c.next;
            b=d;
            if(d==null){
                break;
            }
            d=d.next;
        }

    }
}
