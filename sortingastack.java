import java.util.Stack;

public class sortingastack {
    public void recursion(Stack<Integer> s,int num){
        if(s.size()==0 || num>s.peek()){
            s.add(num);
            return;
        }else{
            int n=s.pop();
            recursion(s, num);
            s.push(n);
        }
    }
    public void sort1(Stack<Integer> s)
	{
		if(s.size()>1){
            int num=s.pop();
            sort1(s);
            recursion(s, num);
        }
	}
    public Stack<Integer> sort(Stack<Integer> s)
	{
		sort1(s);
        return s;
	}
}
