import java.util.Hashtable;

public class sortlinkedlistof012 {
    class Node{
    int data;
    Node next;
    Node(int data){
            this.data = data;
            next = null;
        }
    }

    static Node segregate(Node head){
        if(head==null){
            return null;
        }
        // add your code here
        Hashtable<Integer,Integer> dic = new Hashtable<>();
        dic.put(0,0);
        dic.put(1,0);
        dic.put(2,0);
        Node a =head ;
        Node b =a.next;
        dic.put(a.data,1);
        while(b!=null){
            if(dic.containsKey(b.data)){
                int p = dic.get(b.data);
                p=p+1;
                dic.put(b.data,p);
                a=b;
                b=b.next;
            }
            else{
                dic.put(b.data,1);
                a=b;
                b=b.next;
            }
        }
        int cnt0 = dic.get(0);
        int cnt1 = dic.get(1);
        int cnt2 = dic.get(2);
        Node p =head ;
            while(cnt0>0){
                p.data=0;
                p=p.next;
                cnt0--;
            }
            while(cnt1>0){
                p.data=1;
                p=p.next;
                cnt1--;
            }
            while(cnt2>0){
                p.data=2;
                p=p.next;
                cnt2--;
            }
        
        return head;

    }
    
}
