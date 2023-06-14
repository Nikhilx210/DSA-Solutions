import java.util.*;

public class help_classmates {
    public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
        Stack<Integer> stack1 = new Stack<Integer>();
        // Your code here
        int len=n-1;
        int[] ans = new int[n];
        ans[len]=-1;
        int a= -1;
        stack1.push(a);
        len--;
        while(len>=0){
            if(arr[len]>arr[len+1]){
                stack1.push(arr[len+1]);
                ans[len]=stack1.peek();
            }
            else{
                Boolean stackans=false;
                while(arr[len]<=stack1.peek()){
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
