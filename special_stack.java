import java.util.*;

public class special_stack {
    public void push(int a,Stack<Integer> s)
	{
	    //add code here.
        s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int a=Integer.MAX_VALUE;
           for(int i=0;i<s.size();i++){
                a=Integer.min(a, s.pop());
           }
           return a;
        }
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.isEmpty();
	}
}
