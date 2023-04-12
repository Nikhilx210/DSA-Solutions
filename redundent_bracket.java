import java.util.Stack;

public class redundent_bracket {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> stack1 = new Stack<Character>();
        int ans=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' ||s.charAt(i)=='/' || s.charAt(i)=='*' || s.charAt(i)=='('){
                stack1.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(stack1.peek()=='('){
                    stack1.pop();
                    return 1;
                }
                while(stack1.peek()=='+' || stack1.peek()=='-' ||stack1.peek()=='/' || stack1.peek()=='*'){
                    stack1.pop();
                }
                stack1.pop();
            }
            else{
                continue;
            }
        }
        return 0;
        
    }
}
