import java.util.*;

public class reverse_frst_k_elements {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer> ans1 = new LinkedList<Integer>()  ;
        Stack<Integer> stack1 = new Stack<Integer>();
        int len =q.size();
        for(int i=0;i<k;i++){
            stack1.push(q.remove());
        }
        for(int i=0;i<k;i++){
            ans1.add(stack1.pop());
        }
        for(int i=0;i<len-k;i++){
            ans1.add(q.remove());
        }
        return ans1;
    }

}
