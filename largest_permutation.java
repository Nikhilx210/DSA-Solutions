import java.util.*;

public class largest_permutation {
    void KswapPermutation(long arr[] ,int n,int k)
    {
        long a[]=new long[n];
        for(int i=0;i<arr.length;i++){
            a[(int)arr[i]-1]=i;
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();
        int l=0;
        for(int i=n-1;i>=0;i--){
            if(arr[l]==(long)i+1){
                l++;
                continue;
            }
            long num=arr[l];
            arr[l]=arr[(int)a[i]];
            arr[(int)a[i]]=num;
            a[(int)num-1]=a[i];
            l++;
            k--;
            if(k==0){
                break;
            }
            // for(int j=0;j<arr.length;j++){
            //     System.out.print(arr[j]+" ");
            // }
            // System.out.println();
        }

    }
    public static void main(String[] args)
    {
         
        long arr[] = {4, 5, 2, 1, 3};
        int n = arr.length;
        int k = 2;
     
        KswapPermutation(arr, n, k);

    }
}
