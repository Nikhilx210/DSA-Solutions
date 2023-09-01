public class linkedlistq1 {
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null){
            return  head;
        }
        ListNode a = null;
        ListNode b = head;
        ListNode c =head.next;
        while(b.next!=null){
            b.next=a;
            a=b;
            b=c;
            c=b.next;
        }
        return b;
        
    }
}
