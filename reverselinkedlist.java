public class reverselinkedlist {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode a = head;
            ListNode b = null;
            ListNode c = head.next;
            while(a.next!=null){
                a.next=b;
                b=a;
                a=c;
                c=a.next;
            }
            head =a;
            return head;
            
        }
    }
}
