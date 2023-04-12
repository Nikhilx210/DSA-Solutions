import java.util.*;

public class nextgreaterelement {
    public static long[] nextLargerElement(long[] arr, int n)
    {    Stack<Long> stack1 = new Stack<Long>();
        // Your code here
        int len=n-1;
        long[] ans = new long[n];
        ans[len]=-1;
        long a= -1;
        stack1.push(a);
        len--;
        while(len>=0){
            if(arr[len]<arr[len+1]){
                stack1.push(arr[len+1]);
                ans[len]=stack1.peek();
            }
            else if(arr[len]==arr[len+1]){
                if(arr[len]==stack1.peek()){
                    ans[len]=-1;
                }
                else{
                    ans[len]=stack1.peek();
                }
            }
            else{
                Boolean stackans=false;
                while(arr[len]>stack1.peek()){
                    if(stack1.peek()==-1){
                        stackans =true;
                        ans[len]=-1;
                        stack1.push(arr[len]);
                        break;
                    }else{
                        stack1.pop();
                    }
                }
                if(!stackans){
                    ans[len]=stack1.peek();
                }
            }
            len--;
        }
        return ans ;
    } 
}
