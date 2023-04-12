import java.util.Arrays;

public class swap_and_maximaize {
    long maxSum(long arr[] ,int n)
    {   
        Arrays.sort(arr);
        int front=0;
        int back = n-1;
        long ans=0;
        while(front<back){
            ans+=Math.abs(arr[front]-arr[back]);
            front++;
            if(front==back){
                break;
            }
            ans+=Math.abs(arr[front]-arr[back]);
            back--;
        }
        ans+=Math.abs(arr[0]-arr[back]);
        if(front==back-1 || front==back){
            ans+=Math.abs(arr[front]-arr[back]);
        }
        return ans;
    
        
    }

}
