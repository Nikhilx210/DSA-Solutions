import java.util.*;

public class Stacks_permutation {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> stack1 = new Stack<Integer>();
        int l1= ip.length;
        int j=0;
        for(int i=0;i<l1;i++){
            stack1.push(ip[i]);
            if(ip[i]==op[j]){
                stack1.pop();
                j++;
                while(!stack1.empty()  && stack1.peek()==op[j] && j<l1 ){
                    stack1.pop();
                    j++;
                    
                }
            }
        }
        if(j==l1 && stack1.empty()){
            return 1;
        }
        return 0;
    }
}
