import java.util.*;

public class queue_reversal {
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Queue<Integer> ans = new LinkedList<Integer>()  ;
        Stack<Integer> stack1 = new Stack<Integer>();
        int len=q.size();
        for(int i=0;i<len;i++){
            stack1.push(q.remove());
        }
        for(int i=0;i<len;i++){
            ans.add(stack1.pop());
        }
        return ans;
    }
}
