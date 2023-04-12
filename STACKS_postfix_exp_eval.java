import java.util.Stack;
import java.util.function.IntBinaryOperator;

public class STACKS_postfix_exp_eval {
    public static int evaluatePostFix(String S)
    {
        // Your code here
        int len =S.length();
        
        Stack<Integer> stack1 = new Stack<Integer>();
        for(int i=0;i<len;i++){
            if(S.charAt(i)== '+'){
                int a1=stack1.peek();
                stack1.pop();
                int a2=stack1.peek();
                stack1.pop();
                int ans = a1 + a2;
                stack1.push(ans);
            } 
            else if(S.charAt(i)== '-'){
                int a1=stack1.peek();
                stack1.pop();
                int a2=stack1.peek();
                stack1.pop();
                int ans = a2 - a1;
                stack1.push(ans);
            }
            else if(S.charAt(i)== '*'){
                int a1=stack1.peek();
                stack1.pop();
                int a2=stack1.peek();
                stack1.pop();
                int ans = a1 * a2;
                stack1.push(ans);
            }
            else if(S.charAt(i)== '/'){
                int a1=stack1.peek();
                stack1.pop();
                int a2=stack1.peek();
                stack1.pop();
                int ans = a2 / a1;
                stack1.push(ans);
            }
            else{
                stack1.push((int)S.charAt(i)-((int)'0'));
            }
        }
        return stack1.peek();
    }

}
