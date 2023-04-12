import java.util.Arrays;

public class minimum_sum {
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
                if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
        Arrays.sort(arr);
        String num1 = "";
        String num2 = "";
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                num1+=arr[i];
            }
            else{
                num2+=arr[i];
            }
        }
        long n1 =Long.parseLong(num1);
        long n2 =Long.parseLong(num2);
        long ans =n1+n2;
        return ans;
    }
}
