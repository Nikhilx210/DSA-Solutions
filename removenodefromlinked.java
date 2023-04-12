public class removenodefromlinked {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
                ListNode a =head;
        ListNode b =head;
        while(n>0){
            a=a.next;
            n--;
        }
        while(a.next!=null){
            a=a.next;
            b=b.next;
        }
        b.next=b.next.next;
        return head;
    }
}
