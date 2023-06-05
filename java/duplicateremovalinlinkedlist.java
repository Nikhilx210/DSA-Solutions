import java.util.Hashtable;

public class duplicateremovalinlinkedlist {
    class Node{
        int data;
        Node next;
        Node(int d) {
            data = d; 
            next = null;
    }
}
    public Node removeDuplicates(Node head) 
    {
        Hashtable<Integer,Integer> dic = new Hashtable<>();
        Node a =head ;
        Node b =a.next;
        dic.put(a.data,1);
        while(b!=null){
            if(dic.containsKey(b.data)){
                a.next=b.next;
                b=a.next;

            }
            else{
                dic.put(b.data,1);
                a=b;
                b=b.next;
            }

        }
        return head;
    }
    
}
