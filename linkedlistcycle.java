public class linkedlistcycle {
    class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }
    public boolean hasCycle(ListNode head) {
        ListNode a =head;
        while(a.next!=null || a.val!=1000000){
            a.val=1000000;
            a=a.next;
        }
        if(a.val==1000000){
            return false;
        }
        else{
            return true;
        }
        
        }
}
