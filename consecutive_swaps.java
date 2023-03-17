import java.util.Arrays;

public class consecutive_swaps {
    static void KConsecutiveSwaps(int arr[],int n,int k){
        if(k<=0){
            return;
        }
        int ans=0;
        int leftind=0;
        int rightind=-1;
        for(int i=0;i<n;i++){
            leftind=i;
            ans = arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<ans && k-(j-i)>=0){
                    ans=arr[j];
                    rightind=j;
                    break;
                }
            }
            if(rightind!=-1){
                break;
            }
        }
        k-=rightind-leftind;
        for(int i=rightind;i>leftind;i--){
            int swap= arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=swap;
        }
        if(k>0){
            KConsecutiveSwaps(arr, n, k);
        }
    }
    public static void main(String[] args)
    {
         
        int arr[] = {7, 8, 9, 2, 1};
        int n = arr.length;
        int k = 7;
     
        KConsecutiveSwaps(arr, n, k);
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] +" ");
        }
    }
}
